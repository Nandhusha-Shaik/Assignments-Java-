package assignments;

public class EmployeeData {

	public static void main(String[] args) {
		System.out.println("******* Employee 1 *********");
		Employee e1 = new Employee();
		
		e1.getInfo(1000.25,3);
		e1.addSal();
		e1.addWork();
		System.out.println("Final Employee1 Salary is "+e1.salary);
		
		System.out.println("********* Employee 2 ***********");
		
		Employee e2 = new Employee();
		
		e2.getInfo(200.89, 7);
		e2.addSal();
		e2.addWork();
		System.out.println("Final Employee2 Salary is "+e2.salary);

	}

}
