package Day3;

public class Mainclass {

	public static void main(String[] args) {

		Car ca=new Car();		//creating object
		ca.Brand();				//calling method
		ca.Color();
		ca.Price();
		ca.Height();
		
	System.out.println("****************************************************");	
	
		Bike ba=new Bike();			//creating object
		ba.Brand();					//calling method
		ba.Color();     
		ba.Price();
		ba.Average();
	
	System.out.println("****************************************************");	
		
		Authentication au=new Authentication();			//creating object
		au.auth();										//calling method
		
	System.out.println("****************************************************");	
		
		Calculator cal=new Calculator();		//creating object
		cal.Calc();								//calling method
		
	System.out.println("****************************************************");
	
		Factorial fac=new Factorial();		//creating object
		fac.Fact();							//calling object
	
	}

}
