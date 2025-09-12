package assignments;
import java.util.Scanner;
public class PasswordStrength {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Password: ");
		String pwd = sc.nextLine();
		int digit = 0, upper = 0, lower = 0, special = 0;
		int pwdsize = pwd.length();
		for(int i=0; i<pwdsize; i++){
		    if(Character.isUpperCase(pwd.charAt(i))){
		        upper++;
		    }
		    else if(Character.isLowerCase(pwd.charAt(i))){
		        lower++;
		    }
		    else if(Character.isDigit(pwd.charAt(i))){
		        digit++;
		    }
		    else{
		        special++;
		    }
		} 
		if ( pwdsize >= 8 && upper >= 1 && lower >= 1 && digit >= 1 && special == 1 ){
		        System.out.println("The password strength : Strong");
		}      
		else if ( pwdsize >= 6 && upper >= 1 && lower >= 1 && digit >= 1 ){
		        System.out.println("The password strength : Medium");
		}   
		else {
		        System.out.println("The password strength : Weak");    
		}
	}
}
