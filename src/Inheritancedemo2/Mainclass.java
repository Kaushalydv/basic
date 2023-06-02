package Inheritancedemo2;

public class Mainclass {

	public static void main(String[] args) {
	
	Addition.Sum(10,20);					//static method calling	
	Addition.Sum(10,20,30);
	Addition.Sum(5.2f,6.4f);
	Addition.Sum(5.2f, 6.2f, 8.9f);
	
	System.out.println("****************************************************************************");
	
	Shape.Area(5, 6);						//static method calling
	Shape.Area(6);
	Shape.Area(3.5f);
	
	System.out.println("****************************************************************************");
	}

}
