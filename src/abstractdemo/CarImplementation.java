package abstractdemo;

public class CarImplementation extends Car
{

	@Override
	public void color() {
		System.out.println("The color of car is= Red.");	
	}

	
	@Override
	public void height() {
		System.out.println("The height of car is= 1750.");
	}

	
	@Override
	public void brake() {
		System.out.println("The brake of car is= Discbrake");
		}

	
	@Override
	public void airbag() {
		System.out.println("The airbag of car is= 4airbag.");
		
	}

}
