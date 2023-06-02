package Day2;

import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter any No.=");
	int num=sc.nextInt();
	long Fact=1;
		
		for(int i=1; i<=num; i++)
		{
			Fact=Fact*i;
		}
		System.out.println("The Factorial of "+num+" is = "+Fact);
		
		sc.close();
	}

}
