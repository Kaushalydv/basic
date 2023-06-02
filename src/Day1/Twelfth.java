package Day1;

import java.util.Scanner;

public class Twelfth {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter First No.");
		int a=sc.nextInt();
		
		System.out.println("Enter Second No.");
		int b=sc.nextInt();
		
		System.out.println("Enter Third No.");
		int c=sc.nextInt();
		
		System.out.println("Enter Fourth No.");
		int d=sc.nextInt();
		
		if(a>b && a>c && a>d)
		{
			System.out.println("The Greater No. is:"+a);		
		}
		
		else if(b>c && b>d)
		{
			System.out.println("The Greater No. is:"+b);
		}
		else if(c>b && c>d)
		{
			System.out.println("The Greater No. is:" +c);
		}
		else
		{
			System.out.println("The Greater No. is:" +d);
		}
		
		
		sc.close();
	}
		
		}
		
