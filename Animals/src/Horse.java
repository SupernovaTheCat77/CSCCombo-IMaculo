
public class Horse extends Animal {
	private double speed;

	public Horse(double length, double height, double speed) {
		super(length, height);
		this.speed = speed;
	}
	
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public String makeNoise() {
		return "Neigh.";
	}
	
	@Override
	public String toString() {
		return "Horse";
	}
}
