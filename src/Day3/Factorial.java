package Day3;

import java.util.Scanner;

public class Factorial {
	Scanner sc=new Scanner(System.in);
	
	int num;
	
	public void Fact() {
		System.out.println("Enter the no. for factorial:");
		num=sc.nextInt();
		 
		int F=1;
		
		for(int i=1; i<=num; i++)
		{
			F=F*i;
		}
			System.out.println("The Factorial of the " +num+ " is = "+F);
	}
	
	
}
