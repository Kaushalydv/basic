package Overriding;

public class Racingbike extends Sportsbike{
	
		//local method
	public void brake() {
		System.out.println("The brake of bike is = Disc brake");
	}
	
	public void price() {
		System.out.println("The price of bike is = 2,10,000/-");
	}
	
	public void brand() {										//method overriding
		System.out.println("The brand of bike is = TVS"); 		
	}
	
	public void color() {										// method overriding
		System.out.println("The color of bike is = Green");
	}
	
	public void mileage() {										// method overriding
		System.out.println("The mileage of bike is = 120");
	}
	
	public void engine() {										// method overriding
		System.out.println("The engine of bike is = 450cc");
	}
}
