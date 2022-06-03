package Com.cg.demo;

public class EmpDemo {

	public static void main(String[] args) {
		Employee emp= new Employee();
		emp.eid=101;
		emp.name="Kanu";
		emp.salary=12000;
		System.out.println(emp.eid);
        System.out.println(emp.name);
        System.out.println(emp.salary);
        emp.work();
	}

}
