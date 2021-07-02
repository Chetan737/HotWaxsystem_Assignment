package Shapes_Calculator;

import java.util.Scanner;

public class Square implements Parameter_Detail {

    private double side;
	

	public double getSide() {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Side of Square here : ");
	        String square_side = sc.nextLine();

	        double side = Double.parseDouble(square_side);
			return side;

		}catch(NumberFormatException e) {
			System.out.println("* Please input a number!");
			e.printStackTrace();
			return 0;
		}
	}

	public void setSide(double side) {
		  this.side = side;
	}

	@Override
	public double perimeter() {
		double per = 4*side;
		System.out.println("Perimeter of Sqaure is here :  "+per);
		return 0;
	}

	@Override
	public double area() {
		double area = (side*side);
		System.out.println("Area of Square is here :  "+area);
		return 0;
	}

	@Override
	public double volume() {
		// TODO Auto-generated method stub
		return 0;
	}


}
