import java.util.ArrayList;
import java.util.List;

public class Farm {

	public static void main(String[] args) {
//		Cat felix = new Cat(1.5, 1.0, "Black");
//		Dog fido = new Dog(3, 2, true);
//		Horse bolt = new Horse(7, 8, 32);
//		Animal muppet = new Animal(1, 3);
//		Cat sushi = new Cat(1.5, 1.0, "Black");
//		
//		if (felix == sushi) System.out.println("Felix and Sushi are similar (==)\n");
//		else System.out.println("Felix and Sushi are different (==)\n");
//		
//		if (felix.equals(sushi)) System.out.println("Felix and Sushi are similar (.equals)\n");
//		else System.out.println("Felix and Sushi are different (.equals)\n");
//		
//		System.out.println(felix + "\n" + felix.makeNoise() + "\n\n" +
//				fido + "\n" + fido.makeNoise() + "\n\n" +
//				bolt + "\n" + bolt.makeNoise() + "\n\n" +
//				muppet + "\n" + muppet.makeNoise());
		
		
		Animal[] animals = new Animal[5];
		List<Animal> anim = new ArrayList<>();
		
		animals[0] = new Cat(1, 2, "black");
		anim.add(new Cat(1, 2, "black"));
		animals[1] = new Cat(3, 1, "orange");
		anim.add(new Cat(3, 1, "orange"));
		animals[2] = new Horse(6, 8, 45);
		anim.add(new Horse(6, 8, 45));
		animals[3] = new Dog(2, 4, true);
		anim.add(new Dog(2, 4, true));
		animals[4] = new Horse(12, 16, 200);
		anim.add(new Horse(12, 16, 200));
		
		for (int i = 0; i < animals.length; i++) {
			System.out.print(animals[i].makeNoise() + " Height is ");
			System.out.print(animals[i].getHeight() + ", length is ");
			System.out.print(animals[i].getLength() + ", ");
			if (animals[i] instanceof Cat == true) System.out.println("color is " + ((Cat)animals[i]).getColor());
			if (animals[i] instanceof Horse == true) System.out.println("speed is " + ((Horse)animals[i]).getSpeed());
			if (animals[i] instanceof Dog == true) System.out.println("drooling is " + ((Dog)animals[i]).isDrool());
		}
		
		System.out.println();
		
		for (Animal ani : animals) {
			System.out.print(ani.makeNoise() + " Height is ");
			System.out.print(ani.getHeight() + ", length is ");
			System.out.print(ani.getLength() + ", ");
			if (ani instanceof Cat == true) System.out.println("color is " + ((Cat)ani).getColor());
			if (ani instanceof Horse == true) System.out.println("speed is " + ((Horse)ani).getSpeed());
			if (ani instanceof Dog == true) System.out.println("drooling is " + ((Dog)ani).isDrool());
		}
	}

}
