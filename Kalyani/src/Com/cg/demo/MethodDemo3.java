package Com.cg.demo;

public class MethodDemo3 {

	public static void main(String[] args) {
		System.out.println("main");
		int output=addNums(10,20);
		System.out.println(output);
		hi("Kanu");
	}
static int addNums(int i, int j) {
	return i+j;
}
static void hi(String name) {
	System.out.println("Hi" +name);
	}

}
