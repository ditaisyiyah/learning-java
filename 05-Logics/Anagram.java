package Dita.Logic;
/*
 * Check if the inputted words are anagram
 */
import java.util.Scanner;

public class Anagram {
	public static void main (String [] args) {
		Scanner ya = new Scanner (System.in);
		
		System.out.print("Submit your first word or phrase : ");
		String s1 = ya.next();
		
		System.out.print("Submit your second word or phrase : ");		
		String s2 = ya.next();
		
		ya.close();
	
		//multiple char is ignored
		boolean Anagram = false;
		int i;
		for (i = 0; i < s1.length(); i++) {
			char c1 = s1.charAt(i);
			if (c1 == ' ' || c1 == '.' || c1 == ',' || c1 == '!' || c1 == '?') {
				continue;}
			else {
				int j;
				for (j = 0; j < s2.length(); j++) {
					char c2 = s2.charAt(j);			
					if (c2 == ' ' || c2 == '.' || c2 == ','|| c2 == '!' || c2 == '?') {
						continue;}
					else if (c1 == c2) {
						Anagram = true; }		//if c1 != c2 hen Anagram default value will be generated, FALSE
				}
			}
		}
		
		if (Anagram == true) {
			System.out.println(s1 + " and " + s2 + " is an Anagram");
		}else 
			System.out.println(s1 + " and " + s2 + " is NOT an Anagram");
		
	}
	
}
