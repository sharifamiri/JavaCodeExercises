package day56;

public class Rectangle extends Shape {

	int width;
	int height;
	
	public Rectangle(String color, int width, int height ) {
		super(color);
		this.width = width;
		this.height = height;
		
	}
	
	public static void main(String[] args) {
		Circle c1 = new Circle("blue", 10);
		c1.calculatePerimeter();
		System.out.println("Circle area is: "+c1.calculateArea());
		
		Rectangle r1 = new Rectangle("blue", 7, 10);
		r1.calculatePerimeter();
		System.out.println("Rectangle area is: "+r1.calculateArea());
		
		System.out.println(c1);
		System.out.println(r1);
		
	}

	@Override
	public void calculatePerimeter() {
		
		System.out.println("Perimeter of rectangle is: "+ (2*width*height));
	}

	@Override
	public double calculateArea() {
		
		return width * height;
	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + ", color=" + color + ", calculateArea()="
				+ calculateArea() + "]";
	}

	
	
	
}
