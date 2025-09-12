package assignments;
import java.util.Scanner;
public class LargestNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the First Number: ");
		int num1 = sc.nextInt();
		System.out.print("Enter the Second Number: ");
		int num2 = sc.nextInt();
		System.out.print("Enter the Third Number: ");
		int num3 = sc.nextInt();  
		if ( num1 > num2 && num1 > num3 ){
		        System.out.println("The largest number is "+num1);
		}
		        
		else if ( num2 > num1 && num2 > num3 ){
		        System.out.println("The largest number is "+num2);
		}
		    
		else {
		        System.out.println("The largest number is "+num3); 
		}
	}
}
