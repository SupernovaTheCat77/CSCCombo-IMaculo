
public class Car {

	private String color;
	private int mileage;
	private double amtOfGas;
	private Wheel[] wheels;
	private SteeringWheel steeringWheel;
	
	//Constructors
	public Car() {
		color = "Black";
		mileage = 1000;
		amtOfGas = 50;
		wheels = new Wheel[4];
		steeringWheel = new SteeringWheel();
	}
	
	public Car(String color, int mileage, double amtOfGas, int numWheels) {
		this.color = color;
		this.mileage = mileage;
		this.amtOfGas = amtOfGas;
		wheels = new Wheel[numWheels];
		steeringWheel = new SteeringWheel();
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
	
	public SteeringWheel getSteeringWheel() {
		return steeringWheel;
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
	
	public void setSteeringWheel(int swRadius, String swMaterial) {
		steeringWheel = new SteeringWheel(swRadius, swMaterial);
	}
	
	
	//Methods
	public void drive(int milesDriven) {
		mileage += milesDriven;
		amtOfGas -= (milesDriven/17);
	}

	@Override
	public String toString() {
		Wheel[]wls = getWheels();
		return "CAR:\nColor: " + color + "\nMileage: " + mileage
				+ "\nAmount of gas: " + amtOfGas + "\n\nWHEELS:\nAmount: " + wls.length
				+ "\nRadius: " + wls[0].getRadius() + "\nMaterial: " + wls[0].getMaterial()
				+ "\n\nSTEERING WHEEL:\nRadius: " + steeringWheel.getRadius() + "\nMaterial: " + steeringWheel.getMaterial()
				+ "\n\n";
	}
	
}
