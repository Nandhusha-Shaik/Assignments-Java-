package assignments;

import java.util.Scanner;

public class ITCityOrNot {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a City: ");

		String city = sc.next();

		String cityLower = city.toLowerCase();
		
		String cityUpper = city.toUpperCase();

		if(cityLower.equals("delhi") || cityLower.equals("kolkata") || 
				cityLower.equals("bangalore") || cityLower.equals("mumbai") || 
				cityLower.equals("chennai") || cityLower.equals("hyderabad")){
			System.out.println(city + " is an IT city");
		}
		else if(cityUpper.equals("delhi") || cityUpper.equals("kolkata") || 
				cityUpper.equals("bangalore") || cityUpper.equals("mumbai") || 
				cityUpper.equals("chennai") || cityUpper.equals("hyderabad")){
			
		}
		else{
			System.out.println(city + " is a not IT city");
		}
	}

}
