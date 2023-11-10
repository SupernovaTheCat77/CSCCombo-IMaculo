
public class Rectangle extends Shape {
	
	int height;
	int length;
	
	public Rectangle() {
	}

	public Rectangle(int height, int length) {
		this.height = height;
		this.length = length;
	}

	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	
	@Override
	public double getPerimeter(Shape rectangle) {
		return (((Rectangle)rectangle).getHeight()*2)+(((Rectangle)rectangle).getHeight()*2);
	}
	
	@Override
	public double getArea(Shape rectangle) {
		return (((Rectangle)rectangle).getHeight()*((Rectangle)rectangle).getHeight());
	}
}
