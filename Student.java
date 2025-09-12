package assignments;

public class Student {

	// Attributes
	private String name, address;
	private String joinyear,salary;

	public Student(String name, String address, String joinyear, String salary) {
		super();
		this.name = name;
		this.address = address;
		this.joinyear = joinyear;
		this.salary = salary;
	}

	public void display() {
		System.out.println(name+" "+joinyear+" - "+address);
	}
}
