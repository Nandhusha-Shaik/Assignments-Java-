package assignments;
import java.util.Scanner;
public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int num = sc.nextInt();
		int fact = 0;
		for(int i=1;i<num/2;i++){
		    if(num%i==0){
		        fact++;
		    }
		}
		if(fact==0){
	     System.out.println(num+" is a prime number");
		}
		else{
		    System.out.println(num+" is not a prime number");
		}
	}
}
