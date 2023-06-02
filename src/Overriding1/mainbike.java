package Overriding1;

public class mainbike {

	public static void main(String[] args) {
		
		Bike bb=new Bike();					//creating object
		bb.color();							//calling method
		
		Bike.price();						//static method calling
		
	System.out.println("*************************************************************************");
	
		Sportsbike sb=new Sportsbike();			//creating object
		sb.brand();								//calling method
		sb.mileage();
		sb.Color();
		
		Sportsbike.price();  					//static method calling
		
	System.out.println("***************************************************************************");
	
		Racingbike rb=new Racingbike();			//creating object
		rb.brake();								//calling method
		rb.engine();
		rb.Color();
		
		Racingbike.price();
		
		rb.brand();
		rb.mileage();
	
	}
}
