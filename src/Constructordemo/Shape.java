package Constructordemo;

public class Shape {
	int area;
	double carea;
	int Tarea;
	
	
		//non parameterized constructor
	public Shape() {
		System.out.println("I am Constructor of the Shape.");
	}
	
		//parameterized constructor
	public Shape(int side) {
		area=side*side;
		System.out.println("The area of Square is= "+area);
	}

	public Shape(int l, int b) {
		area=l*b;
		System.out.println("The area of Rectangle is: "+area);
	}
	
	public double area(float r) {
		carea=3.14*r*r;
		System.out.println("The area of Circle is: "+carea);
			return carea;
	}
	
	public int Tarea(int b, int h) {
		Tarea=b*h;
		System.out.println("The area of Triangle is: "+Tarea);
		return Tarea;
	}
}
