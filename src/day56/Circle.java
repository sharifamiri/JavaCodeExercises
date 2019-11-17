package day56;

public class Circle extends Shape{

	double radius;
	
	public Circle(String color, double radius) {
		super(color);
		this.radius=radius;
		
	}

	@Override
	public void calculatePerimeter() {
		double c = 2 * Math.PI * radius;
		System.out.println("Perimeter of circle is: " + c);
	}

	@Override
	public double calculateArea() {
		
		double area = Math.PI * (radius * radius);
		return area;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", color=" + color + "]";
	}

	


	
	
	
}
