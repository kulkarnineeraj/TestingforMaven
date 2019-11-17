package com.functionaltest.TestingforMaven;
import java.util.Scanner;

public class Addition {
	 public static int number1,number2,number3;
	 

	 public static void main(String[] args) {
		int result= Add2numbers();
	 }
	
	
	
	public  static int Add2numbers() {
	
	   Scanner input = new Scanner(System.in);

		System.out.print("Enter number1: ");
		number1 = input.nextInt();

		System.out.print("Enter number2: ");
		number2 = input.nextInt();
		   	
		number3=number1+ number2 ;
		System.out.println("Addition of 2 numbers is "+ number3);
		return number3;
		
	
		    

		    	
		    }
		
	}



