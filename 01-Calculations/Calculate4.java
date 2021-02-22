package Dita.Calc;

import java.util.Scanner;
/*
 * Case: conversion x-gallon to litter and otherwise
 * Fact: 1 gallon equals to 3.785 litter
 */
public class Calculate4 {
	private static final double GallonToLiter = 3.785;
	private static final int coba = 3;
	
	public static void main (String [] args) {
		System.out.print("Input any number to convert Gallon to Liter: ");
		Scanner scG = new Scanner (System.in);
		
		double inputG = scG.nextDouble();
		double resultL = inputG * GallonToLiter;
		System.out.println("Your convertion result is: " + resultL);

		System.out.print("\nInput any number to convert Liter to Gallon: ");
		Scanner scL = new Scanner (System.in);
		
		double inputL = scL.nextDouble();
		double resultG = inputL / GallonToLiter;
		System.out.println("Your convertion result: " + resultG);
		
		scG.close();
		scL.close();
		
		double aboc = (double)coba;
		System.out.println(aboc);
	
		int cucut = (int)GallonToLiter;
		System.out.println(cucut);
	}
	
}
