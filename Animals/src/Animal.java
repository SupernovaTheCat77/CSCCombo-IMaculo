
public class Animal {
	
	private double length;
	private double height;
	
	
	
	public Animal(double length, double height) {
		super();
		this.length = length;
		this.height = height;
	}

	public String makeNoise() {
		return "*Animal sound here*";
	}

	@Override
	public String toString() {
		return "Animal";
	}
	
	
	
}
