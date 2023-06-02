package Day1;

import java.util.Scanner;

public class Ninth {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);

	System.out.println("Enter any No.");
		int num=sc.nextInt();
	
		if(num>0)
		{
			System.out.println("No. is Possitive.");
		}
		else if(num<0)
		{
			System.out.println("No. is Negative.");
			
		}
		else
		{
			System.out.println("No.is Zero.");
		}
	
			sc.close();
	}
}
