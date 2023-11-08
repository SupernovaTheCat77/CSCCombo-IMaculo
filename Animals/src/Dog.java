
public class Dog extends Animal {
	
	private boolean drool;

	public Dog(double length, double height, boolean drool) {
		super(length, height);
		this.drool = drool;
	}
	
	public boolean isDrool() {
		return drool;
	}
	public void setDrool(boolean drool) {
		this.drool = drool;
	}

	public String makeNoise() {
		return "Woof.";
	}
	
	@Override
	public String toString() {
		return "Dog";
	}
	
	
	
}
