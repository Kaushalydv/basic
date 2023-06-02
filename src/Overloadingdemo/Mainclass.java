package Overloadingdemo;

public class Mainclass {
	public static void main(String[] args) {
		
		Addition aa=new Addition();			//creating object
		aa.addition(10,20);					//calling method
		aa.addition(10, 30, 35);
		aa.addition(32.5f, 20.2f);
		aa.addition(52.6f, 12.6f, 45.2f);

		System.out.println("****************************************************************"); 
		
		Shape ss=new Shape();			//creating object
		ss.area(12, 10);                //calling method
		ss.area(5);
		ss.area(3.5f);
	}

}
