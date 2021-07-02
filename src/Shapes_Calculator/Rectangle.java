package Shapes_Calculator;

import java.util.Scanner;

public class Rectangle implements Parameter_Detail {

	private double length;
	private double breadth;
	

	public double getLength() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of Rectangle here : ");
        String l = sc.nextLine();
        double length = Double.parseDouble(l);
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getBreadth() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter breadth of Rectangle here: ");
        String b = s.nextLine();
        double breadth = Double.parseDouble(b);
		return length;
	}

	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}

	@Override
	public double perimeter() {
		double perimeter = 2*(length+breadth) ;
		System.out.println("Perimeter of Rectangle is here : "+perimeter);
		return 0;
	}

	@Override
	public double area() {
		double area = (length*breadth);
		System.out.println("Area of Rectangle is here :"+area);
		return 0;
	}

	@Override
	public double volume() {
		// TODO Auto-generated method stub
		return 0;
	}

}
