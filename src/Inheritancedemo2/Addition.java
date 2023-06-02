package Inheritancedemo2;

public class Addition {
	
	//static method
	static void Sum(int a, int b) {
	int sum=a+b;
	System.out.println("Addition of 2 No. is = "+sum);
	}
	
	static void Sum(int a, int b, int c) {
	int sum=a+b+c;
	System.out.println("Addition of 3 No. is = "+sum);
	}
	
	static void Sum(float a, float b) {
	double summ=a+b;
	System.out.println("Addition of 2 decimal No. is = "+summ);
	}

	static void Sum(float a, float b, float c) {
	double summ=a+b+c;
	System.out.println("Addition of 3 decimal No. is = "+summ);
	}
}
