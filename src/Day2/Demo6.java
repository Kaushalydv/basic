package Day2;

import java.util.Scanner;

public class Demo6 {
	
	//static method
	public static void Calculator() {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter first no.=");
	int num1=sc.nextInt();
		
	System.out.println("Enter second no.=");
	int num2=sc.nextInt();
		
			int sum=num1+num2;
			System.out.println("The Sum of these no. is=" +sum);
			
			int sub=num1-num2;
			System.out.println("The Substraction of these no. is=" +sub);
			
			int mul=num1*num2;
			System.out.println("The Multiplication of these no. is=" +mul);
			
			int div=num1/num2;
			System.out.println("The Division of these no. is=" +div);
			
			int rem=num1%num2;
			System.out.println("The Reminder of these no. is=" +rem);
	
		sc.close();
	}
	
	/*public static void main(String[] args) {
		Demo6.Calculator();

	}*/

}
