package Dita.Logic;
/*
 * Simple calculator
 */
import java.util.Scanner;

public class Calculator {
	public static void main (String [] args) {
		//TERNARY
		int x = 8;
		String hasil = (x < 7)? "X less than 7": "X less than 8";		//Ternary Statement must be assigned into variable 
		System.out.println(hasil);
		
		//SWITCH CASE DEFAULT BREAK
		Scanner scn = new Scanner (System.in);

		System.out.print("\nInput your first operand Integer : ");
		double d1 = (double) scn.nextInt();
		
		System.out.print("Input your second operand Integer : ");
		double d2 = (double) scn.nextInt();
		
		System.out.println("\nWhat do you want to do with them ?");
		System.out.print("Input your operator (*, +, /, %, -) :  ");
		String ope= scn.next();
		
		scn.close();
		
		double res;
		switch(ope) {
			case("*"): res = d1 * d2;	break;
			case("+"): res = d1 + d2;	break;
			case("/"): res = d1 / d2;	break;
			case("%"): res = d1 % d2;	break;
			case("-"): res = d1 - d2;	break;
			default: res = 0.0;
		}
		if (res != 0) {
			System.out.println("Your result is " + res);
		}System.out.println("You inputted wrong operator, please try again.");
		
	}
	
}
