package Day3;

import java.util.Scanner;

public class Bike {

	Scanner sc=new Scanner(System.in);
	
	String brand;
	String color;
	int price;
	int average;
	
	public void Brand() {
		System.out.println("Enter the Brand of the Bike:");
		brand=sc.next();
		System.out.println("Brand = "+ brand);
	}
	
	public void Color() {
		System.out.println("Enter the color of Bike:"); 
		color=sc.next();
		System.out.println("Color = "+color);
	}
	
	public void Price() {
		System.out.println("Enter the Price of the Bike:");
		price=sc.nextInt();
		System.out.println("Price = "+price);
	}
	
	public void Average() {
		System.out.println("Enter the Average of the Bike:");
		average=sc.nextInt();
		System.out.println("Average = "+average +"Km");
	}
}
