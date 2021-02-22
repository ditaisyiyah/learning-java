package Dita.Peop;

public class StudentTest extends Student{	
/*
 * explicitly extends is not required as long as 
 * the class is in public and in the same package
 * and the things invoked are has been set in public too
 * but i recommend you to explicitly declare if you had
 * so much class and maybe there is some of name are even
 */
	
	public static void main (String [] args) {
		Student S0 = new Student ();
		Student S1 = new Student ("Chandler Bing", 
								  123456789, 
								  "Active");
		Student S2 = new Student ("Lisa Kudraw", 
				  					/*123456789,*/ 
				  					"Active");
									
		/*
		 * you only can print an object which its parameter
		 * has been declared in an constructor in object class
		 * this package is not dynamic, so stiff and framed
		 * so unmodifiable
		 */
		S0.printData();
		S1.printData();
		S2.printData();
	}
	
}
