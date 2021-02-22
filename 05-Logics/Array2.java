package Dita.Logic;
/*
 * Get the average from arrays
 */
public class Array2 {
	public static void main (String [] args) {
		//NOT recommend this declaration ways, then followed by initialization it's length and/or elements
		int nono1 [];
		//this is better						
		int [] rekomen2 = {1,2};
		//this is less efficient
		int [] rekomen1 = new int [2];
		rekomen1 [0] = 3;	rekomen1 [1] = 4;
		
//======QUESTION
		int [] sanji = {7,7,6,6,5,5,4,4};
		for(int i=0; i<sanji.length; i=i+2) {
			System.out.print(sanji[i]);						//7 6 5 4
		}
		
		int [][] chopper = {{3,3,3},{2,2,2}};
		int[] ussop = {4,3,2};
		for(int i=0; i<3; i++) {							//it could be for chopper or ussop, because length of both are 3
			chopper[1][i] = chopper[0][i] + ussop[i];		//from this you must know that it definitely implicitly refers to chopper
		}	//int [][] chopper = {{3,3,3}{7,6,5}};
		for(int i=0; i<2; i++) {							//don't you think it must be for chopper
			for(int j=0; j<3; j++) {						
				System.out.print(chopper[i][j]);}			
			System.out.println();}		//333				//to seperate elements in row 2 in different row when printed out
										//765		
										
		int [] tests = {100,100,100,100,100};
		int ave = (tests[1] + tests[2] + tests[3] +tests[4] +tests[2])/tests.length;
		System.out.println("The average is " + ave);
		for(int i=0; i<1; i++) {
			int sum = tests[i];
			for(int j=1; j<tests.length; j++) {
				sum = sum + tests[j];
				System.out.println(sum);}
			System.out.println("The average is " + sum/tests.length);}		
	}
	
}
