package Constructordemo;

public class area extends Shape{
	double area;
	int Tarea;
	
	public area() {
		System.out.println("I am constructor of area class.");
	}
	
	public area(float r, int h) {
		area=3.14*r*r;
		System.out.println("The area of Cylinder is = "+area );
	}
	
	public int Tarea(int b, int h) {
		Tarea=b*h;
		System.out.println("The are of triangle is ="+Tarea);
		return Tarea;
	}
	
	public void Display() {
		this.Tarea(10, 5);		// this take the local reference
		super.Tarea(20, 5);		// super take the parent reference
	
	}
}


