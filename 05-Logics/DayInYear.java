package Dita.Logic;
/*
 * To know what day of the inputted date
 */
import java.util.Scanner;

public class DayInYear {
/*
 * 31 ==> 1, 3, 5, 7, 8, 10, 12
 * 28 ==> 2
 * 30 ==> 4, 6, 9, 11	
 */
	public static void main (String [] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.print("Input the Year number : ");
		int inY = scan.nextInt();
		
		System.out.print("Wanna know if it's a Leap Year or Not? (Yes/No) : ");
		String inF = scan.next();
		
		int tiga1 = 31;
		int tiga0 = 30;
		
		int feb = 28;
		if(inY % 4 == 0) {feb = 29; 
			if(inF.equalsIgnoreCase("yes")) {
				System.out.println (inY + " is a Leap Year!");}
			}else 
				System.out.println (inY + " is NOT a Leap Year.");

		int sum = tiga1*7 + tiga0*4 + feb;
		
		int awal = 0;
		if (inY >= 2021) {						//2024
			awal = 3;
			int q;	int y; 								
			int s = inY - 2021;					//3
			for (q=1; q<s+1; q++) {				//q<4
				--awal;
				y = 2021 + q;
				if (awal == -1) {
					awal = 6;
					if (y % 4 == 0) {--awal;}
				}
				if (y % 4 == 0) {
					--awal;
					if (awal == -1) {awal = 6;}
				}
			}
		}
		
		if (inY < 2021) {						//2016
			awal = 3;
			int q;	int y; 								
			int s = inY - 2021;					//-5
			for (q=-1; q>s-1; q--) {			//q>-6
				++awal;
				y = 2021 + q;
				if (awal == 8) {
					awal = 1;
					if (y % 4 == 0) {++awal;}
				}
				if (y % 4 == 0) {
					++awal;
					if (awal == 8) {awal = 1;}
				}
			}
		}
		
		System.out.println("\nTotal Days in " + inY + " : " + sum);
		System.out.println("Total Days in first week : " + awal);
		
		int thisYear = sum - awal;
		
		int fw = awal;
		int mw = 0;	//full week
		int lw = 0;	//not-full week
		int tw = 0;	//total week
		if ((thisYear)%7 != 0) {			//maka ada sisanya (ada r)
			mw = (int) (thisYear)/7;		
			lw = (thisYear)-(mw*7);		
			tw = (mw + 2);					//1 represents the first week
			System.out.println("\nTotal Weeks in 2021 : " + tw + " weeks.");
			System.out.println("first week(" + fw + " days) + " + 
								mw + " weeks(7 days) + " + 
								"last week(" + lw + " days).");
		}else
			System.out.println("Your number is out of bound of this calender system!");
		
		
		System.out.print("\nPlease input a Week in integer you wanna know what day(s) in it: ");
		int j = scan.nextInt();
		scan.close();
		
		
		if (j <= tw) {
			String d1 = "Monday";		String d2 = "Tuesday";		String d3 = "Wednesday";	
			String d4 = "Thursday";		String d5 = "Friday";		String d6 = "Saturday";		String d7 = "Sunday";
			
			if (j > 1 && j < tw) {
				System.out.println(d1);	System.out.println(d2);	System.out.println(d3);	System.out.println(d4);
				System.out.println(d5);	System.out.println(d6);	System.out.println(d7);
			}
			else if (j == 1) {
				int k;
				for (k = fw; k<8; k++) {
						switch (k) {
							case 1: System.out.println(d1);	break;
							case 2: System.out.println(d2);	break;
							case 3: System.out.println(d3); break;
							case 4: System.out.println(d4); break;
							case 5: System.out.println(d5); break;
							case 6: System.out.println(d6); break;
							case 7: System.out.println(d7); break;
							default: System.out.println("Your for second IF-ELSE is wrong");
						}
					}
			}
			else if (j == tw) {
				int l;
				for (l=lw; l>0; l--) {
					switch (l) {
						case 1: System.out.println(d1);	break;
						case 2: System.out.println(d2);	break;
						case 3: System.out.println(d3); break;
						case 4: System.out.println(d4); break;
						case 5: System.out.println(d5); break;
						case 6: System.out.println(d6); break;
						case 7: System.out.println(d7); break;
						default: System.out.println("Your for second IF-ELSE is wrong");
					}
				}
			}
		
		
		}//END of (print each days of week)
	}//END of MAIN
}//END of CLASS
	

