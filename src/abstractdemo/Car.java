package abstractdemo;

public abstract class Car {

		//non abstract method
	public void price() {
		System.out.println("The price of car is=100000");
	}
	
	 	//abstract method
	public abstract void color();
	
	public abstract void height();
	
	public abstract void brake();
	
	public abstract void airbag();
	
	
	
}
