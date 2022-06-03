package Com.cg.demo.oop;

public class InheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("basic phone");
		BasicPhone phone1 = new BasicPhone();
		phone1.call();
		phone1.sms();

		System.out.println("smart phone");
		SmartPhone phone2 = new SmartPhone();
		phone2.camera();
		phone2.music();
		phone2.call();
		phone2.sms();

	}

}
