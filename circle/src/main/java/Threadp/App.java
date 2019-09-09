package Threadp;

public class App {

	public static void main(String[] args) {
		HelloWorldThead r1 = new HelloWorldThead();
		Thread t1 = new Thread(r1);
		t1.start();

	}

}
