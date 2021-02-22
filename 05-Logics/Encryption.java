package Dita.Logic;
/*
 * Simple encryption
 */
import java.util.Scanner;

public class Encryption {
	/*
	 * User must input 7 valid numbers (1=D, 2=W, 3=E, 4=L, 5=H, 6=O, 7=R)
	 * Otherwise, give another chance until 10 times input valid numbers 
	 */ 
	public static void main (String [] args) {
		Scanner cr = new Scanner (System.in);
		
		System.out.println("Please enter your Encrypted Code below.");
		
		int i = 0;
		
		while (i < 10) {
			int c = cr.nextInt();
			char k;
			switch (c) {							
				case(1): k = 'D'; break;	case(2): k = 'W'; break;
				case(3): k = 'E'; break;	case(4): k = 'L'; break;
				case(5): k = 'H'; break;	case(6): k = 'O'; break;
				case(7): k = 'R'; break;
				default: k = 'X'; continue;			//it will not print X because CONTINUE means ignore any case except 1-7
													//instead out of switch and go below, it backs to the switch in the first place
													//until 10 times of 7 valid number inputed
			}
			System.out.println(k);
		i++;
		}
		cr.close();
		
	}
}