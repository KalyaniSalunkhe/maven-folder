package Com.cg.demo;

public class Employee {
	static String officeaddress;
	public int eid;
	String name;
	double salary;
	void work() {
		System.out.println("Employee works...");
		
	}

	public static void main(String[] args) {
		officeaddress ="Aroli, Newmumbai";
		Employee obj=new Employee();
		obj.eid=101;
		obj.name="Kanu";
		obj.salary=12000;
		System.out.println(obj.eid);
		System.out.println(obj.name);
		System.out.println(obj.salary);

	}

}
