
public class Driver {

	public static void main(String[] args) {
//		Car myCar = new Car("red", 42, 22.0);
		Car yourCar = new Car("Blue", 100, 43.2, 4);
		yourCar.setWheels(17, "Platinum");
		
		System.out.println(yourCar);
		yourCar.drive(50);
		System.out.println(yourCar);
		
		
		
//		System.out.println("My car's color is " + myCar.getColor() + ", it has " + myCar.getMileage() + " miles, and has " + myCar.getAmtOfGas() + " gallons of gas.");
//		System.out.println("Your car's color is " + yourCar.getColor() + ", it has " + yourCar.getMileage() + " miles, and has " + yourCar.getAmtOfGas() + " gallons of gas.");
	}

}
