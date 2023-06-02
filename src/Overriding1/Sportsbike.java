package Overriding1;

import java.util.Scanner;

public class Sportsbike extends Bike {
	Scanner ss=new Scanner(System.in);
	
	String brand;				//Global variable
	int mileage;
	
		//local method
	public void brand() {
		System.out.println("Enter the brand of bike:");
		brand=ss.next();
		System.out.println("The brand of bike is = "+brand);
	}
	
	public void mileage() {
		System.out.println("Enter the mileage of bike:");
		mileage=ss.nextInt();
		System.out.println("The mileage of bike is = "+mileage);
	}
	
	
	public void Color() {										//method overriding
		System.out.println("The color of Bike is = Black");
	}
	
	static void  price() {								//method overriding
		System.out.println("The price of bike is = 130000");
	}
}

