package Dita.Logic;
/*
 * Determine get into (Mountville) university
 */
import java.util.Scanner;

public class Mountville {
	public static void main (String [] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter you GPA : ");	double gpa = sc.nextDouble();
		System.out.print("Enter you SAT : ");	int sat = sc.nextInt();
		sc.close();
		
		if (sat >= 1400) {	
			System.out.println("Congratulation! You get into Mounville University!");
		}else if (gpa >= 4.0 && sat >= 1100){
			System.out.println("Congratulation! You get into Mounville University!");
		}else if (gpa >= 3.5 && sat >= 1300){
			System.out.println("Congratulation! You get into Mounville University!");
		}else if (gpa >= 3.0 && sat >= 1500){
			System.out.println("Congratulation! You get into Mounville University!");
		}else	
			System.out.println("We are sorry you can't get into Mounville University.");
		
//========THIS IS THE 2ND WAY, MORE EFFICIENT
		if (sat >= 1400 || gpa >= 4.0 && sat >= 1100 || gpa >= 3.5 && sat >= 1300 || gpa >= 3.0 && sat >= 1500) {
			System.out.println("Congratulation! You get into Mounville University!");
		}else	
			System.out.println("We are sorry you can't get into Mounville University.");
		
	}
}
