
public class RunnableMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread mt1 = new Thread(new MyThread(), "pingthred");
		Thread at1 = new Thread(new AnotherThread(), "pong thred");
		mt1.start();
		
		at1.start(); 
		System.out.println("Main thread exited");
		System.out.println("this is new line");
	}

}
