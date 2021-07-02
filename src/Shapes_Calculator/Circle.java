package Shapes_Calculator;
import Model.Area_Per_Volume_Shapes;

import javax.management.modelmbean.ModelMBean;
import java.util.Scanner;

public class Circle implements Parameter_Detail {

	private double radius;

	public static double getRadius() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Radius of Cicle here : ");
		String r = sc.nextLine();
		double radius = Double.parseDouble(r);
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double perimeter() {
		try {
		double per = 2*3.14*(this.radius);
		System.out.println("Perimeter of Circle is here : "+per);
		return 0;
		}catch(ArithmeticException ex) {
			ex.printStackTrace();
			return 0;
		  }
	}

	@Override
	public double area() {
		double area = 3.14*(this.radius*this.radius);
		System.out.println("Area of Circle is here : "+area);
		return 0;
	}


	@Override
	public double volume() {
		// TODO Auto-generated method stub
		return 0;
	}


}
