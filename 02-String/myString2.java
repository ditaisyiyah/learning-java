package Dita.Lett;

/*
 * Three ways to print
 */
 
public class myString2 {
	
	String s1 = "abc";
	
	public myString (String val) {
		this.s1 = val;
	}
	public myString () {}
	
	public void setString () {}
	public String getString () {
		return s1;
	}
	
	public static void main(String []args) {
		//1ST WAY
		String myString = "abc";						
		System.out.println(myString);
		//2ND WAY
		myString myString2 = new myString ("abc");		
		System.out.println(myString2.getString());
		//3RD WAY
		myString myString3 = new myString ();			
		System.out.println(myString3.getString());
	}
	
}


