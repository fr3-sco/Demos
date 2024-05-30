package exercise_2;

import java.util.Scanner;


public class assignment_2 {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		double dblFah;
		double dblCel;
		double dblc;
		double dblf;
		
		System.out.println("Fahrenheit/Celsius Conversion");
		System.out.println("Enter degrees in Fahrenheit: ");
		
		dblFah = userInput.nextDouble();
		dblc = (dblFah - 32) * (5.0/9.0);
		
		System.out.println(dblFah + " Fahrenheit converted to Celsius is ");
		System.out.println(dblc);
		
		System.out.println("That was fun. Let's turn it around. Enter degrees in Celsius: ");
		dblCel = userInput.nextDouble();
		dblf = (9.0/5.0) * dblCel + 32; 
		
		System.out.println(dblCel + " Celsius converted to Fahrenheit is ");
		System.out.println(dblf);		
		
		userInput.close();
		
		
	}

}
