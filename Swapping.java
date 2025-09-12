package assignments;

import java.util.Scanner;

public class Swapping {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of A Before Swapping:");
		int A = sc.nextInt();
		System.out.print("Enter the value of B Before Swapping:");
		int B = sc.nextInt();
		A=A+B;
		B=A-B;
		A=A-B;
		System.out.print(" After Swapping A="+A+" and B="+B);
	}

}
