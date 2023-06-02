package Overriding;

public class Sportsbike extends Bike {

		//local method
	public void mileage() {
		System.out.println("The mileage of bike is = 110 ");
	}

	public void engine() {
		System.out.println("The engine of bike is = 350cc");
	}
	
	public void color() {											// method overriding
		System.out.println("The color of bike is = Black");
	}
	
	public void brand() {											// method overriding
		System.out.println("The brand of bike is = Yamha");
	}
}

