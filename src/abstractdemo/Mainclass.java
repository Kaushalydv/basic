package abstractdemo;

public class Mainclass {

	public static void main(String[] args) {
		
		CarImplementation cc=new CarImplementation();			//creating object
		cc.color();												//calling method
		cc.height();
		cc.airbag();
		cc.brake();
		
		cc.price();
		
	System.out.println("****************************************************************************");	
		
	
		Phoneimplementation pp=new Phoneimplementation();			//creating object
		pp.Brand();													//calling method
		pp.Model();
		pp.Color();
		pp.Price();
		pp.Camera();
		pp.Ram();
		pp.Rom();
		pp.Processor();
		pp.Battery();
		pp.Screen();
			
	}
}
