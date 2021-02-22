package Dita.Lett;
/*
 * Three ways to print
 */
public class myString2 {
	String s1 = "abc";
	
	public myString2 () {}
	public myString2 (String val) {this.s1 = val;}
	
	public void setString () {}
	public String getString () {return s1;}
	
	public static void main(String []args) {
		//1ST WAY
		myString2 str3 = new myString2 ();			
		System.out.println(str3.getString());
		//2ND WAY
		myString2 str2 = new myString2 ("abc");		
		System.out.println(str2.getString());
		//3RD WAY
		String str = "abc";						
		System.out.println(str);
	}
	
}


