package Overriding;

public class mainBike {

	public static void main(String[] args) {
		
		Bike bb=new Bike();
		bb.brand();
		bb.color();
	System.out.println("****************************************************************************");	
		
		Sportsbike sb=new Sportsbike();
		sb.mileage();
		sb.engine();
		sb.brand();
		sb.color();
	System.out.println("****************************************************************************");
	
		Racingbike rb=new Racingbike();
		rb.brake();
		rb.price();
		rb.mileage();
		rb.engine();
		rb.brand();
		rb.color();
	System.out.println("****************************************************************************");	
	}
}
