
public class Car {

	private String color;
	private int mileage;
	private double amtOfGas;
	
	//Constructors
	public Car() {
		
	}
	
	public Car(String color) {
		this.color = color;
	}
	
	public Car(String color, int mileage) {
		this.color = color;
		this.mileage = mileage;
	}
	
	public Car(String color, int mileage, double amtOfGas) {
		this.color = color;
		this.mileage = mileage;
		this.amtOfGas = amtOfGas;
	}
	
	//Accessors
	public String getColor() {
		return this.color;
	}
	
	public int getMileage() {
		return this.mileage;
	}
	
	public double getAmtOfGas() {
		return this.amtOfGas;
	}

}
