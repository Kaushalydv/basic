package Encapsulationdemo2;

public class Bike {
	
	//pojo class
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

	@Override
	public String toString() {
		return "Bike [Brand=" + Brand + ", Color=" + Color + ", Price=" + Price + ", Airbag=" + Airbag + "]";
	}
	
	

}
