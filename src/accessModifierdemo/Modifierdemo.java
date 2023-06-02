package accessModifierdemo;

public class Modifierdemo {
	
	//within class
	private void Privatem() {
		System.out.println("Thos is Private.");
	}
	
	//within package
	void Defaultm() {
		System.out.println("This is Default.");
	}
	
	//within package, outside package by inheritance or making child class.
	protected void Protectedm() {
		System.out.println("This is Protected.");
	}
	
	//everywhere
	public void Publicm() {
		System.out.println("This is Public.");
	}
	
	public static void main(String[] args) {
		Modifierdemo md=new Modifierdemo();		//creating object
		md.Privatem();							//calling method
		md.Defaultm();
		md.Protectedm();
		md.Publicm();
		
	}
}
