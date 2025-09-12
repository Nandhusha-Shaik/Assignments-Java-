package assignments;

public class Employee {
	
		// Attributes
		double salary;
		int workhours;
		
		// To know salary details of employee and updating salary based on working hours
		public void addSal() {
			if(salary < 500) {
				salary += 10;
			}
			System.out.println("Employee Salary updated to $ "+salary);
		}

		public void addWork() {
			if(workhours > 6) {
				salary += 5;
			}
			System.out.println("Employee Salary updated based on working hours is $ "+salary);
		}


		public void getInfo(double sal, int worktime) {
			salary = sal;
			workhours = worktime;
			System.out.println("The salary of an employee is $ "+sal+" and working hours per day is "+worktime+" hours");
		}
}
