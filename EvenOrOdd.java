package assignments;

import java.util.Scanner;

public class EvenOrOdd {
	public static void main(String[] args) {
		System.out.println("Enter a Number: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n%2==0) {
			System.out.println("The Given is an Even Number..");
		}
		else {
			System.out.println("The Given is an odd Number..");
		}
	}

}
