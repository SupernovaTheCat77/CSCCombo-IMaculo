
public class Farm {

	public static void main(String[] args) {
		Cat felix = new Cat(1.5, 1.0, "Black");
		Dog fido = new Dog(3, 2, true);
		Horse bolt = new Horse(7, 8, 32);
		Animal muppet = new Animal(1, 3);
		System.out.println(felix + "\n" + felix.makeNoise() + "\n\n" +
				fido + "\n" + fido.makeNoise() + "\n\n" +
				bolt + "\n" + bolt.makeNoise() + "\n\n" +
				muppet + "\n" + muppet.makeNoise());
	}

}
