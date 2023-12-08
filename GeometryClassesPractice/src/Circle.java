
public class Circle extends Shape {
	
	int radius;
	
	public Circle() {
	}

	public Circle(int radius) {
		this.radius = radius;
	}
	
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	@Override
	public double getPerimeter(Shape circle) {
		return (6.283*((Circle)circle).getRadius());
	}
	
	@Override
	public double getArea(Shape circle) {
		return ((Circle)circle).getRadius()*((Circle)circle).getRadius()*3.1415;
	}
}
