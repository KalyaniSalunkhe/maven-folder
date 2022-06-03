package Com.cg.demo.oop;

public class AbstractDemo {
	
	public static void main(String[] args) {

		Hdfcbank bank1 = new Hdfcbank();
		bank1.payInterest();
		bank1.doKyc();

		AxisBank bank2 = new AxisBank();
		bank2.payInterest();
		bank2.doKyc();

	}
}

