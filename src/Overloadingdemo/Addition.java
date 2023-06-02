package Overloadingdemo;

public class Addition {

	int sum; 				//global variable
	double summ;
	
	public void addition(int a, int b) {		//Parameterized method
		sum=a+b;
		System.out.println("The sum of two no. is = "+sum);	
	}	

	public void addition(int a, int b, int c) {
		sum=a+b+c;
		System.out.println("The sum of three no. is = "+sum);
	}
	
	public void addition(float a, float b) {
		summ=a+b;
		System.out.println("The sum of two decimal no. is = "+summ);
	}
	
	public void addition(float a, float b, float c) {
		summ=a+b+c;
		System.out.println("The sum of three decimal no. is = "+summ);
	}
}
