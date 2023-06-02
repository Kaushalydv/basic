package Constructordemo;

public class Mainclass {

	public static void main(String[] args) {
		Shape sn=new Shape();		//creating object
		
		Shape ss=new Shape(5);
		
		Shape sr=new Shape(5,6);

	System.out.println("***************************************************************************");
	
	area a=new area();
	area as=new area(4.5f,5);

	System.out.println("***************************************************************************");
	
	as.Display();
	}

}
