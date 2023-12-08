
public class Animal {
	
	private double length;
	private double height;
	
	public Animal(double length, double height) {
		super();
		this.length = length;
		this.height = height;
	}
	
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}

	public boolean equals(Animal animal) {
		return (this.length == animal.length && this.height == animal.height)? true: false;
	}

	public String makeNoise() {
		return "*Animal sound here*";
	}
	
	public String makeNoise(String noise) {
		return noise;
	}

	@Override
	public String toString() {
		return "Animal";
	}
	
	
	
}
