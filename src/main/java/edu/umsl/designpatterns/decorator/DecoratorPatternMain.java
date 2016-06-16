package edu.umsl.designpatterns.decorator;

public class DecoratorPatternMain {

	public static void main(String[] args) {
		Shape circle = new Circle();
		Shape blueCircle = new BlueShapeDecorator(new Circle());
		Shape blueRectangle = new BlueShapeDecorator(new Rectangle());

		System.out.println("Circle with normal border : ");
		circle.draw();
		System.out.println("\nCircle of red border");
		blueCircle.draw();

		System.out.println("\nRectangle of red border");
		blueRectangle.draw();
	}

}
