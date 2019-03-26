package jpseclipselink.demo;

public class Test01 {
	public Test01() {
		Runtime.getRuntime().addShutdownHook(new Thread() {
			public void run() {
				System.out.println("shutting down...");
			}
		});
	}
	
	public void myprint() {
		System.out.println("my print running...");
	}

	public static void main(String[] args) {
		Test01 test01 = new Test01();
		test01.myprint();
	}

}
