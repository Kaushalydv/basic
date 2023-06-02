package Day3;

import java.util.Scanner;

public class Car {

	Scanner sc=new Scanner(System.in);
		String b;	// Global Variable
		String c;
		int p;
		int h;
	
			//normal method
	public void Brand() {
		System.out.println("Enter the Brand of the Car:");
		b=sc.next();
		System.out.println("Brand = "+b);	
	}
	
			
	public void Color() {
		System.out.println("Enter the Color of the Car:");
		c=sc.next();
		System.out.println("Color = "+c);
	}
	
			
	public void Price() {
		System.out.println("Enter the Price of the Car:");
		p=sc.nextInt();
		System.out.println("Price = "+p);
	}
	
			
	public void Height() {
		System.out.println("Enter the Height of the Car:");	
		h=sc.nextInt();
		System.out.println("Height = "+h+"mm");
	}
	
	

}
