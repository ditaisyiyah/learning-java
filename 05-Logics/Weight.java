package Dita.Logic;
/*
 * Covert weight from Earth
 */
import java.util.Scanner;

public class Weight {
	public static void main (String [] args) {
		Scanner scn2 = new Scanner (System.in);
		
		System.out.print("Input your weight in Earth : ");
		double e = scn2.nextDouble();
		
		System.out.print("What Planet do you want to go: ");
		String p = scn2.next();
		
		scn2.close();
		
		double w;
		switch (p) {
			case ("Mercury"): w = e * .38;	break;
			case ("Venus")	: w = e * .91;	break;
			case ("Mars")	: w = e * .38;	break;
			case ("Jupiter"): w = e * 2.36;	break;
			case ("Saturn")	: w = e * .92;	break;
			case ("Uranus")	: w = e * .89;	break;
			case ("Neptune"): w = e * 1.13;	break;
			default			: w = 0.0;
		}
		if (w != 0.0) {
			System.out.println("\nYour weight on " + p + "is : " + w + "lbs.");
		}System.out.println("Please follow Mercury, Venus, Mars, Jupiter, Saturn, Uranus, or Neptune.");
		
	}
}
