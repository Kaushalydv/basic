package abstractdemo;


	//multiple interface class implements & abstract class extends here.
public class Phoneimplementation extends Keypad implements Phone, Smartphone {

	
	
	@Override
	public void Brand() {				//every abstract methods in interface class must be implemented here.
		System.out.println("Brand = Samsung");
		
		
	}

	@Override
	public void Model() {
		System.out.println("Model = Note2");
		
	}
	
	@Override
	public void Color() {
		System.out.println("Color = White");
	}

	@Override
	public void Price() {
		System.out.println("Price = 15000/- ");
		
	}

	@Override
	 public void Camera() {
		System.out.println("Camera = 60 mega pxl");
		
	}

	@Override
	public void Ram() {
		System.out.println("RAM = 8GB");
		
	}

	@Override
	public void Rom() {
		System.out.println("ROM = 250GB");
		
	}

	@Override
	public void Processor() {
		System.out.println("Processor = Snapdragon 845");
		
	}

	@Override
	public void Battery() {				// abstract class's methods implemented here.
		System.out.println("Batery = Good");
		
	}

	@Override
	public void Screen() {					
		System.out.println("Screen = Touch");
		
	}

	
	
}