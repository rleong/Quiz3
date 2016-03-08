package base;

public class Triangle extends GeometricObject{
	
	//Variable Declarations
	//Represents side of triangle
	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;
	
	/**
	 * Creates a blank triangle
	 */
	public Triangle(){
	}
	
	/**
	 * Triangle
	 * Creates a new triangle with 3 sides
	 * @param side1
	 * @param side2
	 * @param side3
	 */
	public Triangle(double side1, double side2, double side3){
		super();
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	public double getSide1() {
		return side1;
	}

	public void setSide1(double side1) {
		this.side1 = side1;
	}

	public double getSide2() {
		return side2;
	}

	public void setSide2(double side2) {
		this.side2 = side2;
	}

	public double getSide3() {
		return side3;
	}

	public void setSide3(double side3) {
		this.side3 = side3;
	}
	
	/**
	 * getArea
	 * Gets the area using Heron's formula
	 */
	@Override
	public double getArea() {
		//Finds the area of a triangle
		double p = (side1 + side2 + side3)/2;
		double area = Math.sqrt((p*(p-side1)*(p-side2)*(p-side3)));
		return area;
	}

	/**
	 * getPerimeter
	 * gets the perimeter off of the 3 sides
	 */
	@Override
	public double getPerimeter() {
		//Finds perimeter of triangle
		double perimeter = side1 + side2 + side3;
		return perimeter;
	}
	
	/**
	 * toString
	 * gives a brief description of the Triangle
	 */
	@Override
	public String toString() {
		//Returns a description of the triangle
		String description = "The triangle has sides " + String.valueOf(side1) + ", " + String.valueOf(side2) + ", and " + String.valueOf(side3) + "./n";
		return description;
	}
	
}
