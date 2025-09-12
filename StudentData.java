package assignments;

import java.util.Scanner;

public class StudentData {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Student 1 details: ");
		Student s1 = new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
		System.out.print("Enter the Student 2 details: ");
		Student s2 = new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
		System.out.print("Enter the Student 3 details: ");
		Student s3 = new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
		
		s1.display();
		s2.display();
		s3.display();
	}
}
