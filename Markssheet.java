package assignments;

import java.util.Scanner;

public class Markssheet {

	public static void main(String[] args) {
		System.out.println("Enter the Marks: ");
		Scanner sc= new Scanner(System.in);
		int mark = sc.nextInt();
		if(mark<100 && mark>90) {
			System.out.println("Your grade is A");
		}
		else if(mark<89 && mark>80) {
			System.out.println("Your grade is B");
		}
		else if(mark<79 && mark>70) {
			System.out.println("Your grade is C");
		}
		else if(mark<69 && mark>60) {
			System.out.println("Your grade is D");
		}
		else {
			System.out.println("Your grade is F");
		}
	}
}
