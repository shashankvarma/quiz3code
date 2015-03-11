package quiz3;

public class Triangle  extends GeometricObject  {
	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;
	private double all_three_sides = (side1 + side2 + side3)/2;

	public Triangle (){
		
	}
	
	
	public Triangle(double side1, double side2, double side3){
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	public double getSide1(){
		return side1;
	}
	
	
	public double getSide2(){
		return side2;
	}
	
	public double getSide3(){
		return side3;
	}
	
	
	public double getArea(){
		return Math.sqrt(all_three_sides * ((all_three_sides - side1)*(all_three_sides - side2)*(all_three_sides - side3)));
	}
	
	
	public double getPerimeter(){
		return all_three_sides * 2;
	}
	
	
	public String ToString(){
		return"The length of the side 1: "+ side1 + "\nThe length of the side 2: " + side2+ "\nThe length of the side";
	
	
	}
}

