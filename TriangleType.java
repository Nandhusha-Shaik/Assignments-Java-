package assignments;

import java.util.Scanner;

public class TriangleType {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Sides of the Triangle: ");
		int side1 = sc.nextInt();
		int side2 = sc.nextInt();
		int side3 = sc.nextInt();
		if ( side1 == side2 && side1 == side3 ){
			System.out.println("The triangle is equilateral");
		}
		else if ( side1 == side2 || side2 == side3 ){
			System.out.println("The triangle is isosceles");
		}
		else {
			System.out.println("The triangle is scalene");
		}
	}
}
