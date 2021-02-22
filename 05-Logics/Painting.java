package Dita.Logic;
/*
 * Price you must paid for your needed paint
 */
import java.util.Scanner;

public class Painting {
	public static void main (String [] args) {
		double height, length, width;
		double area = 0, price = 0;
		
		Scanner ou = new Scanner (System.in);
		
		System.out.print("Insert your height : ");		height = ou.nextDouble();
		System.out.print("Insert your length : ");		length = ou.nextDouble();
		System.out.print("Insert your width : ");		width = ou.nextDouble();
		
		ou.close();
		
		area = 2*((height*length) + (height*width));
		
		//5$ for 15L and 1500 feet square
		//1% for 4L and 300 feet square
		if (area%1500 == 0) {
			price = 5*(area/1500);
		}else if (area < 1500) {
			price = 1*(area/300);
		}else
			System.out.println("Your inputted number is incorrect!");
		
		System.out.println("\nYour total area will be painted : " + area + " square feet.");
		System.out.println("It will cost your money : " + price + " $.");		
		
	}
	
}
