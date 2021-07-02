package Shapes_Calculator;

import java.util.Scanner;

public class Traingle implements Parameter_Detail {

	private double height;
	private double base;
	private double side;
	
	public double getHeight() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Height of Triangle here : ");
        String h = sc.nextLine();
        double height = Double.parseDouble(h);
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getBase() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Base of Triangle here : ");
        String b = sc.nextLine();
        double base = Double.parseDouble(b);
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getSide() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Side of Triangle here : ");
        String s = sc.nextLine();
        double side = Double.parseDouble(s);
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	@Override
	public double perimeter() {
		double per = (height+base+side);
		System.out.println("Perimeter of Triangle is here : "+per);
		return 0;
	}

	@Override
	public double area() {
		double area = (1/2)*(base*height);
		System.out.println("Area of Triangle is here : "+area);
		return 0;
	}

	@Override
	public double volume() {
		// TODO Auto-generated method stub
		return 0;
	}
}
