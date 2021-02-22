package Dita.toStr;

public class Animal {
	int weight, height;
	double speed;
	String name;
	
	Animal (String n){
		weight = 50; height = 4;
		speed = 2; //miles per hour
		name = n;
	}
	
	Animal (String n, int w, int h, double s){
		weight = w;
		h = height;  //height is assigned into h
		speed = s;
		name = n;
	}

	public double getTime (double miles) {	//gets the number of hours to go these miles
		return miles/speed;
	}

	public String getName() {return name;}
	public int getWeight() {return weight;}
	public int getHeight() {return height;}
	public double getSpeed() {return speed;}
	
	public String toString () {
		String Animal = getName() + " has a speed of " + getSpeed(); 
		System.out.println(Animal);
		return Animal; 
	}
	
	public static void main (String [] args) {
		Animal Animal1 = new Animal("Dodi");
		Animal Animal2 = new Animal("Anjing", 100, 8, 4);
		Animal1.toString();
		Animal2.toString();
		
	}
	
	
}
