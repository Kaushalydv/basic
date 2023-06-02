package Encapsulationdemo;

public class Car {
	
		//Pojo class (plain old java object)
	
	private String Brand;		
	
	private String Color;
	
	private int Price;
	
	private int Airbag;
	
	
	public String getBrand() {
		return Brand;
	}
	public void setBrand(String brand) {
		Brand = brand;
	}
	
	
	public String getColor() {
		return Color;
	}
	public void setColor(String color) {
		Color = color;
	}
	
	
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
	}
	
	
	public int getAirbag() {
		return Airbag;
	}
	public void setAirbag(int airbag) {
		Airbag = airbag;
	}

}
