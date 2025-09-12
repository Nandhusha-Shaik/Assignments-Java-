package assignments;

import java.util.Scanner;

public class AgeCalculation {

	public static void main(String[] args) {
		 Scanner sc = new Scanner (System.in);
	        System.out.println("Enter Your Birth Year: ");
	        int birthyear = sc.nextInt();
	        int currentyear = 2024;
	        int age = currentyear - birthyear;
	        System.out.println(" You are "+ age +" years old..");
	}

}
