package Overriding1;

import java.util.Scanner;

public class Racingbike extends Sportsbike {
	Scanner ss=new Scanner(System.in);
	
	String brake;
	int engine;
	
	
	public void brake() {
		System.out.println("Enter the brake of bike(Normalbrake/Discbrake):");
		brake=ss.next();
		System.out.println("The brake of bike is="+brake);
	}
	
	public void engine () {
		System.out.println("Enter the engine cc of bike:");
		engine=ss.nextInt();
		System.out.println("The engine of bike is = "+engine +"cc");
	}
	
	public void brand() {									//method overriding
		System.out.println("The brand of bike is = TVS");
	}
	
	 static void price() {									//method overriding
		System.out.println("The price of bike is = 150000");
	}
}	
