import java.util.Random;

public class Die {
	private int numSides;
	private int value;
	private static Random rand = new Random();
	
	public Die() {
		this.numSides = 6;
		this.value = 1;
	}

	public Die(int numSides) {
		super();
		this.numSides = numSides;
		this.value = 1;
	}

	public int getNumSides() {
		return numSides;
	}
	public void setNumSides(int numSides) {
		this.numSides = numSides;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	
	public void roll() {
		this.value = (rand.nextInt(numSides))+1;
	}

	@Override
	public String toString() {
		return "Number of sides: " + numSides + "\nValue: " + value;
	}
}
