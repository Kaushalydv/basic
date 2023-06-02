package inheritancedemo1;

public class Mainclass {

	public static void main(String[] args) {
		Employee ee = new Employee();		//creating object
			ee.Name();						//calling method
			ee.Dept();
			ee.Floor();
			
	System.out.println("****************************************************************************");
			
		Salary ss= new Salary();
			ss.Name();
			ss.Dept();
			ss.Floor();
			ss.salary();
			ss.shift();
			
	}
}
