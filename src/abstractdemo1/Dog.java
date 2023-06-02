package abstractdemo1;

public class Dog extends Animal{

	@Override
	public void Sound() {
		System.out.println("The Dog is barking.");
	}

	Dog(){
		super();
	}
}
