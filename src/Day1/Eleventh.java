package Day1;

import java.util.Scanner;

public class Eleventh {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter First No.");
		int a=sc.nextInt();
		
		System.out.println("Enter Second No.");
		int b=sc.nextInt();
		
		System.out.println("Enter Third No.");
		int c=sc.nextInt();
		
		if(a>b && a>c)
		{
			System.out.println("The Greater No. is:"+a);		
		}
		
		else if(b>c)
		{
			System.out.println("The Greater No. is:"+b);
		}
		else 
		{
			System.out.println("The Greater No. is:" +c);
		}
		
		sc.close();
	}
		
		}
		
