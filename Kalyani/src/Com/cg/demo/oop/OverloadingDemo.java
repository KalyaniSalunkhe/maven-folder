package Com.cg.demo.oop;

public class OverloadingDemo {
	//polymorphism - ability to take more than one forms 

	// two types 
	// - method overloading - compile time polymorphism 
	// method overriding - run time polymorphism 

	//- method overloading - 

	//methods with the same name but with different arguments 
	//- 1. number of arguments should be different 
	//- 2. types of arguments should be different 
	//- 3. order of arguments should be different 



		static void addNums(int i, int j) {
			System.out.println(i + j);
		}

		// - 1. number of arguments should be different
		static void addNums(int i, int j, int k) {
			System.out.println(i + j + k);
		}

		// - 2. types of arguments should be different
		static void addNums(int i, long j) {
			System.out.println(i + j);
		}

		// - 3. order of arguments should be different
		static void addNums(long i, int j) {
			System.out.println(i + j);
		}

		public static void main(String[] args) {
			OverloadingDemo.addNums(10, 20);
			OverloadingDemo.addNums(10, 20, 30);

		}

	}
	 


