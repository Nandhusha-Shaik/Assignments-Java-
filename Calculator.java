package assignments;

public class Calculator {

	public static void main(String[] args) {
		   System.out.println("Simple Calculator");
			
		   int a = Integer.parseInt(args[0]);
		   int b = Integer.parseInt(args[1]);
		   char operator = Character.parseChar(args[2]);
		  
		   switch(operator){
		       case '+':
		                 System.out.println("Addition of two numbers is "+(a+b));
		                 break;
		       case '-':
		                 System.out.println("Subtraction of two numbers is "+(a-b));
		                 break;
		       case '*':
		                 System.out.println("Multiplication of two numbers is "+(a*b));
		                 break;
		       case '/':
		                 System.out.println("Division of two numbers is "+(a/b));
		                 break;
		       default :
		                 System.out.println("Enter valid operator for calculation");
		                 break;
		}
	}
}
