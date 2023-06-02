package Day1;

import java.util.Scanner;

public class Fourth {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
	 System.out.println("Enter First no.:");
	 	int num1=sc.nextInt();
	 
	 System.out.println("Enter Second no.:");
	 	int num2=sc.nextInt();
	 
	 	int sum=num1+num2;
	 	int sub=num1-num2;
	 	int mul=num1*num2;
	 	int div=num1/num2;
	 System.out.println("The Sum of the given no. is="+sum);
	 System.out.println("The Substraction of the given no. is="+sub);
	 System.out.println("The Multiplication of the given no. is="+mul);
	 System.out.println("The Division of the given no. is="+div);
	 
	 
	 sc.close();
}
}