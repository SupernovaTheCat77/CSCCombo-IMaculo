
public class Car {

	private String color;
	private int mileage;
	private double amtOfGas;
	private Wheel[] wheels;
	
	//Constructors
	public Car() {
		color = "Black";
		mileage = 1000;
		amtOfGas = 50;
	}
	
	public Car(String color, int mileage, double amtOfGas, int numWheels) {
		this.color = color;
		this.mileage = mileage;
		this.amtOfGas = amtOfGas;
		wheels = new Wheel[numWheels];
	}
	
	//Getters
	public String getColor() {
		return this.color;
	}
	
	public int getMileage() {
		return this.mileage;
	}
	
	public double getAmtOfGas() {
		return this.amtOfGas;
	}
	
	public Wheel[] getWheels() {
		return wheels;
	}
	
	//Setters
	public void setColor(String color) {
		this.color = color;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

	public void setAmtOfGas(double amtOfGas) {
		this.amtOfGas = amtOfGas;
	}

	public void setWheels(int radius, String material) {
		for (int i = 0; i < wheels.length; i++) {
			wheels[i] = new Wheel(radius, material);
		}
	}
	
	//Methods
	public void drive(int milesDriven) {
		mileage += milesDriven;
		amtOfGas -= (milesDriven/17);
	}

	@Override
	public String toString() {
		return "OF CAR:\nColor: " + color + "\nMileage: " + mileage + "\nAmount of gas: " + amtOfGas + "\n\nOF WHEELS:\nRadius: ";
	}
	
	

}
