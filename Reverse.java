package assignments;
import java.util.Scanner;
public class Reverse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int num = sc.nextInt();
		int rev = 0;
		while(num !=0){
		    rev = rev*10+num%10;
		    num/=10;
		}
	    System.out.println("The reversed number is "+rev);
	}
}
