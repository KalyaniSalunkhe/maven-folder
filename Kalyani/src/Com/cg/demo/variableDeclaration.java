package Com.cg.demo;

public class variableDeclaration {

	public static void main(String[] args) {
		int num1=100;
		int num2=200;
		int sum=num1+num2;
		
		System.out.println("sum");//300
		
		System.out.println(sum);//300
		System.out.println(sum++);//300
		System.out.println(++sum);//302
		System.out.println(sum--);//302
		System.out.println(--sum);//300
		System.out.println(sum);
		
	}

}
