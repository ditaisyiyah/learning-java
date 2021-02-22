package Dita.Bool;
/*
 * How boolean works
 */
public class TorF {
	private final static int i = 5, j = 6;
	private static boolean true_false;					//====> default value is FALSE
	
	public TorF() {}
	
	public void setI() {}
	public int getI() {return i;}
	public void setJ() {}
	public int getJ() {return j;}
	public void setTF() {}
	public boolean getTF() {return true_false;}
	
	public boolean cor1() {boolean tf1 = (j < 5); 						return tf1;}	//F
	public boolean cor2() {boolean tf2 = (j > 3); 						return tf2;}	//T
	public boolean cor3() {boolean tf3 = (j < 1); 						return tf3;} 	//F
	public boolean cor4() {boolean tf4 = (i < 5); 						return tf4;} 	//F
	public boolean cor5() {boolean tf5 = (j <= 5); 						return tf5;} 	//F
	public boolean cor6() {boolean tf6 = (6 < 6); 						return tf6;} 	//F
	public boolean cor7() {boolean tf7 = (i != j); 						return tf7;} 	//T
	public boolean cor8() {boolean tf8 = (i == j || i < 50); 				return tf8;} 	//T
	public boolean cor9() {boolean tf9 = (i == j && i < 50); 				return tf9;} 	//F
	public boolean cor10() {boolean tf10 = (i > j || true_false && j >= 4); 		return tf10;} 	//F		====> the most left worked first
	public boolean cor11() {boolean tf11 = (!(i < 2 && j == 5)); 				return tf11;} 	//T
	public boolean cor12() {boolean tf12 = (!true_false); 					return tf12;} 	//T
	
	public static void main (String [] args) {
		TorF c1 = new TorF();
		System.out.println(c1.cor1());	System.out.println(c1.cor2());	
		System.out.println(c1.cor3());	System.out.println(c1.cor4());	
		System.out.println(c1.cor4());	System.out.println(c1.cor5());
		System.out.println(c1.cor7());	System.out.println(c1.cor8());	
		System.out.println(c1.cor9());	System.out.println(c1.cor10());	
		System.out.println(c1.cor11());	System.out.println(c1.cor12());
	}
	
}
