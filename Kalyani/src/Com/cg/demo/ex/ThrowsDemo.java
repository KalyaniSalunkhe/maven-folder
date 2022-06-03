package Com.cg.demo.ex;

public class ThrowsDemo {
	static void printLoop() throws InterruptedException {

		for (int i = 1; i <= 10; i++) {

			Thread.sleep(500); // pause the execution for some time

			System.out.println(i);

		}
	}

	public static void main(String[] args) throws InterruptedException {

		ThrowsDemo.printLoop();
}
}