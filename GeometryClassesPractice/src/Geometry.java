import java.util.ArrayList;
import java.util.List;

public class Geometry {

	public static void main(String[] args) {
		List<Shape> shapeList = new ArrayList<>();
		shapeList.add(new Shape());
		shapeList.add(new Circle(10));
		shapeList.add(new Rectangle(10, 10));
		
		printAll(shapeList);
	}
	
	public static void printAll(List<Shape> shape) {
		for (int i = 0; i < shape.size(); i++) {
			if (shape.get(i) instanceof Rectangle == true) System.out.print("Shape type: Rectangle");
			else if (shape.get(i) instanceof Circle == true) System.out.print("Shape type: Circle");
			else System.out.print("Shape type: Nondescript");
			System.out.printf("\nArea: %.2f", shape.get(i).getArea(shape.get(i)));
			System.out.printf("\nPerimeter: %.2f", shape.get(i).getPerimeter(shape.get(i)));
			System.out.println("\n");
		}
		
	}

}
