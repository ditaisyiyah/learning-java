package Dita.Inventory;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ProductTester {
	
	public static void main (String [] args) {
		Scanner in = new Scanner (System.in);
		int maxSize, menuChoice;
		
		maxSize = getNumProduct(in);

		if(maxSize == 0) {
			System.out.println("No products requiered!");
		}else { 
			Product[] products = new Product [maxSize];
			addToInventory(products, in);
			do {
				menuChoice = getMenuOption(in);
				executeMenuChoice(menuChoice, products, in);
			}while(menuChoice!=0);
			//
		}
	}
	
	// Executing each identified menu choice
	static void executeMenuChoice(int menuChoice, Product[]products, Scanner in) {
		switch(menuChoice) {
		case 1 : displayedInventory(products);			break;
		case 2 : addInventory(products, in);			break;
		case 3 : deductInventory(products, in);			break;
		case 4 : discontinueInventory(products, in);	break;
		default : System.out.println("\n..The program has been stoped!");	// case 0
		}
		
	}
	
	// Discontinuing each identified product
	static void discontinueInventory(Product[]products, Scanner in) {
		int productChoice = getProductNumber(products,in);
		boolean updatedValue = false;
		products[productChoice].discontinueInventory(updatedValue);
	}
	
	// Deducting stock value to each identified product
	static void deductInventory(Product[] products, Scanner in) {
		int productChoice = getProductNumber(products,in);
		
		System.out.println("\nHow many products do you want to deduct?");
		int updatedValue = -1; // the amount of stock to be added
		do {
			try {
				updatedValue = in.nextInt();
				if(updatedValue < 0 || updatedValue > products[productChoice].getQty()) System.out.println("Incorrect Value entered!");
			} catch (InputMismatchException e) {
				System.out.println("Incorrect data type entered!");
				in.nextLine();	// IMPORTANT
			}
		}while(updatedValue < 0 || updatedValue > products[productChoice].getQty());
		products[productChoice].deductFromInventory(updatedValue);
	}
	
	// Adding stock value to each identified product
	static void addInventory(Product[] products, Scanner in) {
		int productChoice = getProductNumber(products,in);
		
		System.out.println("\nHow many products do you want to add?");
		int updatedValue = -1; // the amount of stock to be added
		do {
			try {
				updatedValue = in.nextInt();
				if(updatedValue < 0) System.out.println("Incorrect Value entered!");
			} catch (InputMismatchException e) {
				System.out.println("Incorrect data type entered!");
				in.nextLine();	// IMPORTANT
			}
		}while(updatedValue < 0);
		products[productChoice].addToInventory(updatedValue);
	}
	
	// Displaying index value of the array and name of each product
	// Allowing the user to select the product to update (add/deduct)
	static int getProductNumber(Product[]products, Scanner in) {
		for(int i = 0; i < products.length; i++) {
			System.out.println("\n[" + i + "] " + products[i].getName());
		}
		System.out.println("\nWhat product do you want to update?"
				+ "\nPlease enter the index : ");
		int productChoice = -1;
		do {
			try {
				productChoice = in.nextInt();
				if(productChoice < 0 || productChoice > products.length-1) System.out.println("Incorrect Value entered!");
			} catch (InputMismatchException e) {
				System.out.println("Incorrect data type entered!");
				in.nextLine();	// IMPORTANT
			}
		}while(productChoice < 0 || productChoice > products.length-1);
		return productChoice;
	}
	
	// Displaying menu choice
	static int getMenuOption(Scanner in) {
		System.out.println("\n1. View Inventory"
				+ "\n2. Add Stock"
				+ "\n3. Deduct Stock"
				+ "\n4. Discontinue Product"
				+ "\n0. Exit"
				+ "\nPlease enter a menu option:");
		int menuChoice = -1;	// IMPORTANT
		do {
			try {
				menuChoice = in.nextInt();
				if(menuChoice < 0 || menuChoice > 4) System.out.println("Incorrect Value entered!");
			} catch (InputMismatchException e) {
				System.out.println("Incorrect data type entered!");
				in.nextLine();	// IMPORTANT
			}
		}while(menuChoice < 0 || menuChoice > 4);
		return menuChoice;
		
	}
	
	// Inputing the amount of product that want to be inputed
	static int getNumProduct(Scanner in) {
		System.out.println("Enter the number of products you would like to add"
				+ "\nEnter 0 (zero) if you do not wish to add products:");
		int maxSize = -1;	// must be initialized (why -1 ?)
		do {
			try {
				maxSize = in.nextInt();
				if (maxSize < 0) System.out.println("Incorrect Value entered");
			} catch (InputMismatchException e) {
				System.out.println("Incorrect data type entered!");
				in.nextLine();	// IMPORTANT
			}
		}while(maxSize < 0);
		return maxSize;
	}
	
	// Assigning the values of object
	static void addToInventory(Product[] products, Scanner in) {
		for(int i = 0; i < products.length; i++) {
			products[i] = new Product();	// using default constructor
			System.out.println("\nAdding product " + i+1 + " .."
					+ "\nEnter the product item number, name, amount, and price:");
			in.nextLine();	// IMPORTANT
			products[i].pNumber = in.nextInt();
			products[i].pName = in.next();
			products[i].pQty = in.nextInt();
			products[i].pPrice = in.nextDouble();
		}
	}
	
	// Displaying the values of object
	static void displayedInventory(Product[] products) {
		for(Product product : products) {
			System.out.print("\n"+product);
		}
	}
	
	
}
