package Day3;

import java.util.Scanner;

public class Calculator {
	Scanner sc=new Scanner(System.in);
	
	int num1;
	int num2;
	
	public void Calc() {
		System.out.println("Enter 1st No.:");
		num1=sc.nextInt();
		
		System.out.println("Enter 2nd No.:");
		num2=sc.nextInt();
		
		int Sum=num1+num2;	
		System.out.println("Sum of "+num1+" & "+num2+" is = "+Sum);
		
		int Sub=num1-num2;	
		System.out.println("Substraction of "+num1+" & "+num2+" is = "+Sub);
		
		int mul=num1*num2;
		System.out.println("Multiplication of "+num1+" & "+num2+" is = "+mul);
		
		int div=num1/num2;
		System.out.println("Devision of "+num1+" & "+num2+" is = "+div);
		
		int rem=num1%num2;
		System.out.println("Reminder of "+num1+" & "+num2+" is = "+rem);
		}

}
