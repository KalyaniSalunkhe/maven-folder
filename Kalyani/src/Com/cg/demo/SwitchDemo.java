package Com.cg.demo;
public class SwitchDemo {

	public static void main(String[] args) {

		int input = 4;

		switch (input) {
		case 1:
			System.out.println("One");
			break;
		case 2:
			System.out.println("Two");
			break;
		case 3:
			System.out.println("Three");
			break;
		case 4:
			System.out.println("Four");
			break;
		case 5:
			System.out.println("Five");
			break;
		default:
			System.out.println("Other");
		}

		input = 4;

		if (input == 1) {
			System.out.println("One");
		} else if (input == 2) {
			System.out.println("Two");
		} else if (input == 3) {
			System.out.println("Three");
		} else if (input == 4) {
			System.out.println("Four");
		} else if (input == 5) {
			System.out.println("Five");
		} else {
			System.out.println("Other");
		}

	}

}
