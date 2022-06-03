package Com.cg.demo.pc1;

public class Demo1 {
	

	// access modifiers / access specifiers 
	// public - accessible everywhere 
	// protected - accessible within subclass and the package 
	// <package> (default) - accessible within the package 
	// private - accessible only within the class 

	

		public static int publicField = 10;
		protected static int protectedField = 20;
		static int packageField = 30;
		private static int privateField = 40;

		public static void main(String[] args) {
			System.out.println(Demo1.publicField);
			System.out.println(Demo1.protectedField);
			System.out.println(Demo1.packageField);
			System.out.println(Demo1.privateField);
		}
	}

