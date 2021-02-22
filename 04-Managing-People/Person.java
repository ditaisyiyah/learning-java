package Dita.Peop;
/*
 * this class will define a person and the information about person
 */
// 
public class Person {
	//declare a variable for the person's name and age
	String Name = "null";
	int Age = 0;

	//create a constructor that will initialize the name and age variables	
	//include parameters for name and age
	public Person() {
		// TODO Auto-generated constructor stub
	}
	public Person(String val1, int val2) { 
		this.Name = val1;
		this.Age = val2;	
	}
	
	//create a method called getName() that will return the person's name
	public String getName() {return Name;}
	
	//create a method called getAge() that will return the person's age
	public int getAge() {return Age;}
	
	//create a method called setAge() that will set the person's age
	public void setName() {}
	
}
