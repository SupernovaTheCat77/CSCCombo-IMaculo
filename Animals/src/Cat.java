
public class Cat extends Animal{
	private String color;
	
	public Cat(double length, double height, String color) {
		super(length, height);
		this.color = color;
	}
	
	public String makeNoise() {
		return "Meow.";
	}
	
	@Override
	public String toString() {
		return "Cat";
	}
	
	
}
