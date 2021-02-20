package Oracle.JF4;
/*
 * Case: bus capacity = 45 people.
 * How much x-busses needed to carry y-people (input y value)
 */
public class Calculate3 {
	private final static int Bus = 45;
	private int People;
	
	public Calculate3 (int p) {this.People = p;}
	public Calculate3 () {}
	
	public int quotient () {int res = People / Bus;  return res;}
	public int remainder () {int mod = People % Bus;  return mod;}
	
	public static void main (String [] args) {
		Calculate3 c1 = new Calculate3 (80);
		
		System.out.println(c1.quotient());
		System.out.println(c1.remainder());	
	}
}
