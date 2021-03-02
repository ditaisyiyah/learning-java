package Dita.Trivia;
/*
 * Three ways to print
 */
public class Attempt {
	String str = "abc";

	public Attempt () {}	
	public Attempt (String val) {
		this.str = val;
	}

	public void setString () {}
	public String getString () {
		return str;
	}
	
	public static void main(String []args) {
		//1ST WAY
		Attempt str1 = new Attempt ();			
		System.out.println(str1.getString());
		
		//2ND WAY
		Attempt str2 = new Attempt ("abc");		
		System.out.println(str2.getString());
		
		//3RD WAY
		String str3 = "abc";						
		System.out.println(str3);
	}
	
}


