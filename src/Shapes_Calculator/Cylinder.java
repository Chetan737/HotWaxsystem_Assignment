package Shapes_Calculator;

import java.util.Scanner;

public class Cylinder implements Parameter_Detail
 {

	private double radius;
	private double height;
	
	

	public double getRadius() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Radius of Cylinder");
		String r = sc.nextLine();
		double radius = Double.parseDouble(r);
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getHeight() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Height of Cylinder here : ");
                String h = s.nextLine();
                double height = Double.parseDouble(h);
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public double perimeter() {

		return 0;
	}

	@Override
	public double area() {
		double area = (2*3.14*(radius*radius))+(2*3.14*radius*height);
		System.out.println("Area of Cylinder is here : "+area);
		return 0;
	}

	@Override
	public double volume() {
		double volume = 3.14*(radius*radius)*height;
		System.out.println("Volume of Cylinder is here : "+volume);
		return 0;
	}


}
