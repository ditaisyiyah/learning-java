package Dita.Logic;
/*
 * Determine get out of the final exam
 */
import java.util.Scanner;

public class FinalExam {
	public static void main (String [] args) {
		double average;
		int daysAbsent;
		boolean exempt = false;
		
		Scanner reader = new Scanner (System.in);
		System.out.println("This program will determine if you can get out of the final exam.");
		System.out.println("Please answer the following questions.");
		
		System.out.print("\nWhat is your average in the class ? ");	
		average = reader.nextDouble();
		
		System.out.print("How many lectures have you missed ? ");	
		daysAbsent = reader.nextInt();
		
		reader.close();
/*		
		if (average >= 90) {
			if (daysAbsent <= 3) {exempt = true;}
		}else if (average >= 80) {
			if (daysAbsent == 0) {exempt = true;}
		}else exempt = false;							//NO NEED TO DECLARE AGAIN ACTUALLY.
*/		
		
//==========THIS IS THE 2ND WAY
		if (average >= 90 && daysAbsent <= 3) {
			exempt = true;
		}else if (average >= 80 && daysAbsent == 0) {
			exempt = true;
		}
		
		if (exempt) {									//the boolean value default is FALSE (remember)
			System.out.println("Congratulation! You are exempt from the final exam.");
		}else 
			System.out.println("You are not exempt from the final exam.");
		
	}
}
