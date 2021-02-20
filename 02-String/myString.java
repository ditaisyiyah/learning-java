package Dita.Lett;

/*
 * How strings work behind
 */
 
public class myString {
	
	public static void main (String [] args) {
		
		String s1 = "ABC";
		String s2 = new String ("DEF");
		String s3 = "AB" + "C";
		String s4 = s1 + s3;						///concatenation
		
		System.out.println(s1.compareTo(s2));		//lexicographical rank
		System.out.println(s2.equals(s3));			//content (values)
		System.out.println(s3 == s1);				//location (reference values)
		System.out.println(s2.compareTo(s3));
		System.out.println(s3.equals(s1));
		System.out.println(s4);
		
//=============
		
		String alpha = "\"Apa Kabar?\"";  
		String beta = "Kabar Baik."; 
		
		System.out.println(alpha.compareTo(beta)); 	//lexicographical rank
		System.out.println(beta.compareTo(alpha)); 	//index K(beta) - index A(alpha) = 41
		System.out.println(alpha.equals(beta)); 	//objects are not same or equal = F
		System.out.println(alpha==beta); 			//objects are not in same location = F
		System.out.println(alpha); 					//quote
	
		char a = 'K';
		char b = 'L';
		char c = 'K';
		
		System.out.println(a==b);
		System.out.println(a==c);
		
		
		
	}
	
	
}
