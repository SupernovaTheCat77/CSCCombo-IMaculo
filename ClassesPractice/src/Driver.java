
public class Driver {

	public static void main(String[] args) {
		Car izzyCar = new Car("Teal", 100, 43.2, 4);
		izzyCar.setWheels(17, "Platinum");
		izzyCar.setSteeringWheel(12, "Wood");
		Person izzy = new Person("Izzy", "Maculo", 18, 66);
		
		System.out.println(izzy);
		System.out.println(izzyCar);
		
//		yourCar.drive(50);
//		System.out.println(izzyCar);
	}

}
