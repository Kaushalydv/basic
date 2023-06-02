package Day2;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
		
	System.out.println("Enter any No.=");	
	int num=sc.nextInt();
	int sum=0;
	
	for(int i=1; i<=num; i++)	
	{
		sum=sum+i;
	}
		System.out.println("The sum of first "+num+" No. is = "+sum);
	
		sc.close();
	
	}
}
