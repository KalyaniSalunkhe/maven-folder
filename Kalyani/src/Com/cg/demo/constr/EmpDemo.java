package Com.cg.demo.constr;

public class EmpDemo {
	public static void main(String[] args) {

// 		ClassName objectName = new ConstructorName();
		Employee emp = new Employee();
		emp.eid = 101;
		emp.name = "Sonu";
		emp.salary = 50000;
		System.out.println(emp.toString());

		Employee emp2 = new Employee();
		emp2.eid = 102;
		emp2.name = "Monu";
		emp2.salary = 60000;
		System.out.println(emp2.toString());

		Employee emp3 = new Employee(103, "Tonu", 75000);
		System.out.println(emp3.toString());

		Employee emp4 = new Employee(104, "Ponu", 65000);
		System.out.println(emp4.toString());

		Employee emp5 = new Employee(105, "Donu");
		System.out.println(emp5.toString());

	}
}
