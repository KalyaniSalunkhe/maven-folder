package Com.cg.demo;

public class MethodDemo2 {

	public static void main(String[] args) {
		System.out.println("main");
double output=piValue();
System.out.println(output);
	}
	static double piValue() {
		System.out.println("piValue method called");
		return 3.14;
	}

}
