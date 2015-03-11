package mainpackagequiz3;

import quiz3.GeometricObject;

public class Triangle  extends GeometricObject{
	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;

	public Triangle() {
	}

	public Triangle(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	public double getSide1() {
		return side1;
	}

	public double getSide2() {
		return side2;
	}

	public double getSide3() {
		return side3;
	}

	public double getPerimeter() {
		return side1 + side2 + side3;
	}

	public double getArea() {
		double x = this.getPerimeter() / 2;
		double y = Math.sqrt(x * (x - side2) * (x - side2) * (x - side3));
		return y;
	}

	public String toString() {
		return "Triangle Side Lengths: " + side1 + "," + side2 + "," + side3
				+ " Perimeter: " + this.getPerimeter() + " Area: "
				+ this.getArea();
	}

}
