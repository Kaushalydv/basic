package Encapsulationdemo;

public class Mainclass {

	public static void main(String[] args) {
		
		Car cc= new Car();
		cc.setBrand("Hond");
		cc.setColor("Black");
		cc.setPrice(10000);
		cc.setAirbag(4);
		
		System.out.println(cc.getBrand());
		System.out.println(cc.getColor());
		System.out.println(cc.getPrice());
		System.out.println(cc.getAirbag());
	
		System.out.println("*************************************************************************");
	
		
		
		
	
	}

}
