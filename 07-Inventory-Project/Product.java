package Dita.Inventory;
/*
 * Creating an Inventory Project
 */
public class Product {
	// Instance field declaration
	int pNumber;
	String pName;
	int pQty;
	double pPrice;
	boolean pStatus = true;	// true as default condition

// Constructors: to create any object of product class
// Default constructor
public Product() {}
/*
// Constructor that passes any argument, be assigned into instance field
public Product(int number,String name,int qty, double price, boolean status){
	this.pNumber = number;
	this.pName = name;
	this.pQty = qty;
	this.pPrice = price;
	this.pStatus = status;
}
*/

// Method to add the number of unit in stock
public void addToInventory(int qty) {
	this.pQty += qty;
}

// Method to deduct the number of unit in stock
public void deductFromInventory(int qty) {
	this.pQty -= qty;
}

// Method to allow the user to discontinue the status of product
public void discontinueInventory(boolean dis) {
	this.pStatus = dis;
}

// Object that created by default constructor needs these methods
// Setter/mutator: to set any value when an object is created
public void setNumber () {}
public void setName () {}
public void setQty () {}
public void setPrice () {}
public void setValue() {}
public void setStatus() {}
// Getter/accessor: to get/return any value (that has been assigned into instance field) when an object is created
public int getNumber() {return pNumber;}
public String getName() {return pName;}
public int getQty() {return pQty;}
public double getPrice() {return pPrice;}
public double getValue() {return pQty*pPrice;}
public boolean getStatus() {return pStatus;}

// Method of toString: to print out a description of object, use return keyword
public String toString() {
	String stat = (getStatus()==true)? "Active" : "Discontinued";
	String desc = "Item Number : "+ getNumber() +
			"\nName : "+ getName() +
			"\nQuantity in stock : "+ getQty()+
			"\nPrice : "+ getPrice()+
			"\nStock value : "+ getValue()+
			"\nProduct status : "+ stat +
			"\n";
	return desc;
}


	


}