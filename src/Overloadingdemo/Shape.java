package Overloadingdemo;


public class Shape {
	
	int area;   // Global variable
	double carea;
	
	public void area(int l ,int b) {  //Parameterized Local method
		area=l*b;
		System.out.println("The area of the Rectangle:"+area);
	}
	
	public void area(int side) {
		area=side*side;
		System.out.println("The are of the Square:"+area);
	}
	
	public void area(float r) {
		carea=3.14*r*r;
		System.out.println("The area of the Circle:"+carea);
	}
	
}
