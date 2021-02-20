package Dita.Calc;
/*
 * Using built in method for calculation
 */
public class Calculate2 {
	private double X = 1, Y = 1, Z = 1;

	public Calculate2 (double valX, double valY, double valZ) {
		this.X = valX;	
		this.Y = valY;	
		this.Z = valZ;}
	public Calculate2() {}

	public void setX () {}
	public double getX () {return X;}
	public void setY () {}
	public double getY () {return Y;}
	public void setZ () {}
	public double getZ () {return Z;}
	
	public double calcA() {double A = Math.sqrt(X-6)/4; 										
			       return A;}
	public double calcB() {double B = Math.pow(X, Y) - Math.pow(6, X);							
			       return B;}
	public double calcC() {double C = (4*Math.cos(Z/5)) - Math.sin(Math.pow(X, 6));				
			       return C;}
	public double calcD() {double D = Math.pow(X, 4) - Math.sqrt((6*X) - Math.pow(Y, 3));		
			       return D;}
	public double calcE() {double E = 1 / (Y - (1 / (X - Math.pow(2, Y))));						
			       return E;}
	public double calcF() {double F = 7*(Math.cos(Math.sqrt(5 - Math.sin(Math.sqrt(3*X - 4)))));
			       return F;}

	public static void main (String [] args) {
		Calculate2 input = new Calculate2 (9, 7, 5);
		
		System.out.println(input.calcA());
		System.out.println(input.calcB());
		System.out.println(input.calcC());
		System.out.println(input.calcD());
		System.out.println(input.calcE());
		System.out.println(input.calcF());
	}
}
