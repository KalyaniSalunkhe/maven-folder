package Com.cg.demo;


public class StringArrayDemo {

	public static void main(String[] args) {
		
		System.out.println("My friends");

		String[] myFriends = { "Adi", "Rushi", "Shruti" };
		System.out.println(myFriends.length);

		for (String friend : myFriends) {
			System.out.println(friend);
		}

		System.out.println("My other friends");
		
		String[] myOtherFriends = new String[3];

		myOtherFriends[0] = "Sahil";
		myOtherFriends[1] = "Mahesh";
		myOtherFriends[2] = "Aniket";

		for (String friend : myOtherFriends) {
			System.out.println(friend);
		}

		myOtherFriends[1] = "Abcd";
		System.out.println("Friend changed");

		for (String friend : myOtherFriends) {
			System.out.println(friend);
		}
	}	
		
		
}	
		
		
		
	




