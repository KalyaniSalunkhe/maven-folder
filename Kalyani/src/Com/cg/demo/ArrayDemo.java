package Com.cg.demo;

public class ArrayDemo {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		int marksInOneSubject = 98;
//		System.out.println(marksInOneSubject);

		int[] marks = { 98, 95, 99, 96, 97 };

		System.out.println("print an element using index:");
		System.out.println(marks[2]);

		System.out.println("print all elements using for loop:");
		for (int i = 0; i < marks.length; i++) {
			System.out.println(marks[i]);
		}

		System.out.println("print all elements using for each loop:");
		for (int element : marks) {
			System.out.println(element);
		}

		System.out.println("Update elements values in array:");
		marks[2] = 105;
		
		System.out.println("Updated values:");
		for (int element : marks) {
			System.out.println(element);
}
	}
}
