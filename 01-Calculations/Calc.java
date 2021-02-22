package Dita.Calc;
/*
 * Basic knowledge of numbers
 */
public class Calculate {
	private double base, height;
	private final double constant = .5;
	
	public Calculate(double b, double h) {
		this.base = b;
		this.height = h; 
	}
	
	public double calcArea() {
		double area = this.constant*base*height;
		return area;
	}
	
	public static void main (String [] args) {
		Calculate a1 = new Calculate (6, 7);
		System.out.println(a1.calcArea());
		
		//implicit convert and explicit convert
		//explicit convert need casting syntax
		//casting not rounded the result but truncated
		
		double d1 = 8/2;		System.out.println(d1);
		double d2 = 1/8;		System.out.println(d2);			//0.0
		double d3 = (double) 8/2;	System.out.println(d3);
		double d4 = (double) 1/8;	System.out.println(d4);			//0.125 (more accurate)
											//use casting, explicitly convert! 
	//	int i1 = 7.0/3.5;		System.out.println(i1);			//can't convert from large to be small size
	//	int i2 = (int) 7.0/3.5;		System.out.println(i2);			//even you use explicitly convert with casting syntax
		
		int i3 = (int) '5';		System.out.println(i3);			//53
		int i4 = (int) 'A';		System.out.println(i4);			//65
		int i5 = (int) '#';		System.out.println(i5);			//35
		
		char c1 = (char) .2;		System.out.println(c1);
		char c2 = (char) 0.2;		System.out.println(c2);
		char c3 = (char) 2.1;		System.out.println(c3);
		char c4 = (char) 2;		System.out.println(c4);
	//	char c4 = (char) "a";		System.out.println(c4);			//even in the form of single character
											//because String is non-primitive type
											//can't convert crossing type
	}
	
}
