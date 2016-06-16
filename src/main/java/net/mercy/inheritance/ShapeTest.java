package net.mercy.inheritance;

public class ShapeTest {

	public static void main(String[] args) {
		Circle c = new Circle();
		c.setColor("blue"); //inherited from Shape
		c.setRadius(10); // written in Circle
		Square s = new Square();
		s.setColor("Red"); //inherited from Shape
		s.setSide(5); //written in square
		
		double circleArea = Math.PI*c.getRadius()*c.getRadius();
		
		ShapeTest st = new ShapeTest();
		
	}
}
