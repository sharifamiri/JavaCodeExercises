package day60;

import day58.Interface.*;
import day58.sub.Polymorphism.Dog;

public class ShapeUtility {

	
	public static void main(String[] args) {
		
		Shape s1 = new Triangle("Red", 12, 10);
		describeTheShape(s1);
		
		describeTheShape(new Triangle("Red", 12, 10));
		
		describeTheShape(new Square("blue", 5));
		
		//something ridiculous but focus on concept itself
		describeTheShape(new Dog());
		
		Shape myShape = getAnyShape();
		myShape.draw();
		getAnyShape();
		
//		//if Drawable is not static
//		ShapeUtility util = new ShapeUtility();
//		util.getAnyDrawable();
		
		Drawable myDrawable = getAnyDrawable();
		myDrawable.drawLine(2);

	}
	
	public static Drawable getAnyDrawable() {
		Drawable d1 = new Triangle("blue", 12, 10);
		return d1;
		//return new Square("red", 12);
	}
	public static Shape getAnyShape() {
		Shape s1 = new Square("red", 12);
		return s1;
		//return new Square("red", 12);
	}

	//we don't want to create object while calling this
	//utility method so we just made it static
	public static void describeTheShape(Shape anyShape) {
		System.out.println("calling anyShape");
		anyShape.draw();
	}
	public static void describeTheShape(Triangle anyTriangle) {
		System.out.println("calling anyTriangle");
		anyTriangle.draw();
	}
	//do not get fooled by the name
	//it accept any type of Object
	public static void describeTheShape(Object anyObject) {
		System.out.println("calling anyObject");
		//anyObject.draw(); //-->doesn't compile
		//anyObject.makeNoise(); //-->doesn't compile
	}
}

//dynamic polymorphism is about overrriden methods
