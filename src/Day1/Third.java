package Day1;

import java.util.Scanner;

public class Third {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
	
		 
	System.out.println("----------------Reactangle-------------------");	 
	System.out.println("Enter height of Rectangle:");
		int height=sc.nextInt();
	System.out.println("Enter width of Rectangle:");
		int width=sc.nextInt();
		
			int area1=height*width;	
	System.out.println("Area of Rectangle is="+area1);	
	
	
	
	
	// Find area of Square.
	System.out.println("--------------Square--------------");
	System.out.println("Enter side of Square:");
		float side=sc.nextFloat();
	
			double area2=side*side;
	System.out.println("Area of Square="+area2);
	
	
	
	// Find area of Circle.
	System.out.println("-----------------Circle--------------");
	System.out.println("Enter radius of circle:");
		float r=sc.nextFloat();
		
		double area3=3.14*r*r;
	System.out.println("Area of Circle is="+area3);
	
	
	
	
	//Find area of Triangle.
	System.out.println("----------------Triangle-----------------");
	System.out.println("Enter base of triangle:");
		float base=sc.nextFloat();
	System.out.println("Enter height of traiangle:");
		float theight=sc.nextFloat();
		
	double area4=0.5*base*theight;	   
	System.out.println("Area of Triangle is="+area4);
	
	
	
	
	//Find area of Parallelogram.
	System.out.println("------------------Parallelogram------------------");
	System.out.println("Enter base of Parallelogram:");
		float base1=sc.nextFloat();
	System.out.println("Enter vertical height of Parallelogram:");
		float vheight=sc.nextFloat();
		
		double area5=base1*vheight;
	System.out.println("Area of Parallelogram is="+area5);	

	
	
	
	//Find area of Trapezoid.
	System.out.println("--------------Trapezoid----------------------");
	System.out.println("Enter base of Trapezoid:");
		float tbase=sc.nextFloat();
	System.out.println("Enter another base of Trapezoid:");
		float ttbase=sc.nextFloat();
	System.out.println("Enter height of Trapezoid:");
		float tr_height=sc.nextFloat();	
		
		double area6=(tbase+ttbase)/2*tr_height;
	System.out.println("Area of Trapezoid is="+area6);	
	
		
	
	
	
	sc.close();
	
	}
}
