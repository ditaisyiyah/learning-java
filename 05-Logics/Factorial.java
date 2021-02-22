package Dita.Logic;

public class Factorial {

	int factorial = 1;
	int num;
	//int i;
	
	Factorial (int num){
		this.num = num;
	}
	
	int getFactorial() {
		for (int i = num; i > 0 ; i--) {
			factorial *= i;
		}
		return factorial;
	}
	
	public String toString() {
		String ds;
		ds = "Factorial " + num + " = " + getFactorial();
		return ds;
	}
	
	public static void main (String[] args) {
		Factorial f = new Factorial(5);
		System.out.println(f.toString());
	}
	
}
