package Com.cg.demo;

public class ArrayDemo2 {

		

			public static void main(String[] args) {

				// arrays of String, int, double
				// different ways to create arrays

//				int[] arr2 = { 10, 20, 30 };
//				int arr3[] = { 10, 20, 30 };

				@SuppressWarnings("unused")
				int[]arr = { 10, 20, 30 };

				int[] arr4 = new int[5];
				
				arr4[2] = 25;
				arr4[0] = 31;

				for (int a : arr4) {
					System.out.println(a);
				}

			}

		

	}


