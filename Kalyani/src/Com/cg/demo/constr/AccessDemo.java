package Com.cg.demo.constr;


	//static and non static 

	// access 
//		1. static member in static context - with class reference 
//		2. static member in non static context - with class reference 
//		3. non static member in static context - with object reference 
//		4. non static member in non static context - with this keyword  

	public class AccessDemo {

		int num1; // non static field
		static int num2; // static field

		// non static method
		void m1() {
			System.out.println(this.num1); // 4. non static member in non static context - with this reference
			System.out.println(AccessDemo.num2); // 2. static member in non static context - with class reference

		}

		// static method
		static void m2() {
			AccessDemo obj = new AccessDemo();
			System.out.println(obj.num1);// 3. non static member in static context - with object reference
			System.out.println(AccessDemo.num2); // 1. static member in static context - with class reference

		}

		public static void main(String[] args) {

		}

	}

