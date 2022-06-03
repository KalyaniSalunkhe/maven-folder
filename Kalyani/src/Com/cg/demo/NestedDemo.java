package Com.cg.demo;

public class NestedDemo {

	public static void main(String[] args) {

		// plan weekend - painting, treking, shopping, TV, travelling
		// mood
		// friends
		System.out.println("Weekend plan");

		int mood = 2; // 1 means good, other number means bad
		int friends = 2; // 1 means available, other number means not available

		if (mood == 1) {
			if (friends == 1) {
				System.out.println("mood - good, friends - available -- travelling");
			} else {
				System.out.println("mood - good, friends - not available --painting");
			}

		} else {
			if (friends == 1) {
				System.out.println("mood - not good, friends - available --TV");
			} else {
				System.out.println("mood - not good, friends - not available --sleeping");
			}
		}
	}
}