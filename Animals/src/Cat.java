
public class Cat extends Animal{
	private String color;
	
	public Cat(double length, double height, String color) {
		super(length, height);
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

	public boolean equals(Cat cat) {
		return (this.getLength() == cat.getLength() && this.getHeight() == cat.getHeight() && this.color.equals(cat.getColor()))? true: false;
	}
	
	public String makeNoise() {
		return "Meow.";
	}
	
	@Override
	public String toString() {
		return "Cat";
	}
	
	
}
