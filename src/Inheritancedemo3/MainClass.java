package Inheritancedemo3;

public class MainClass {

	public static void main(String[] args) {
		
		Student.Name();			//static method calling
		Student.Class();
		Student.Age();
		Student.Gender();
		
		System.out.println("*******************************************************************************");		

		College.Dept();			//static method calling
		College.City();
		College.Name();
		College.Class();
		College.Age();
		College.Gender();

		System.out.println("*******************************************************************************");

		Course cc=new Course();			//creating object
		cc.coursename();				//calling method
		cc.courseduration();
	
		Course.Name();					//static method calling
		Course.Class();
		Course.Age();
		Course.Gender();
		Course.Dept();
		Course.City();
	
	
	}
	
}
