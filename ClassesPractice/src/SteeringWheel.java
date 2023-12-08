
public class SteeringWheel {
	private int radius;
	private String material;
	
	public SteeringWheel() {
		radius = 10;
		material = "Leather";
	}
	
	public SteeringWheel(int radius, String material) {
		this.radius = radius;
		this.material = material;
	}

	public int getRadius() {
		return radius;
	}

	public String getMaterial() {
		return material;
	}

	@Override
	public String toString() {
		return "OF STEERING WHEEL:\nRadius: " + radius + "\nMaterial: " + material + "\n";
	}
}
