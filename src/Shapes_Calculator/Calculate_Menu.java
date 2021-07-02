package Shapes_Calculator;

import java.util.Scanner;

public class Calculate_Menu {
    public static void main(String[]args) {
        int choice=0;
        Scanner sc = new Scanner(System.in);
        do {
            try {
                System.out.println("\n\n*** Calculator Area and Perimeter ***");
                System.out.println("------------------1 Circle------------------");
                System.out.println("------------------2 Rectangle------------------");
                System.out.println("------------------3 Triangle------------------");
                System.out.println("------------------4 Square------------------");
                System.out.println("------------------5 Sphere------------------");
                System.out.println("------------------6 Cylinder------------------");

                System.out.println("Enter the number of your choice!\n");
                choice = sc.nextInt();

                switch(choice) {
                    case 1:
                        Circle circle = new Circle();
                        double radius = circle.getRadius();
                        circle.setRadius(radius);
                        circle.area();
                        circle.perimeter();
                        break;

                    case 2:
                        Rectangle rectangle = new Rectangle();
                        double length = rectangle.getLength();
                        rectangle.setLength(length);
                        double breadth = rectangle.getBreadth();
                        rectangle.setBreadth(breadth);
                        rectangle.area();
                        rectangle.perimeter();
                        break;

                    case 3:
                        Traingle triangle = new Traingle();
                        double height = triangle.getHeight();
                        triangle.setHeight(height);
                        double base = triangle.getBase();
                        triangle.setBase(base);
                        double side = triangle.getSide();
                        triangle.setSide(side);
                        triangle.area();
                        triangle.perimeter();
                        break;

                    case 4:
                        Square square = new Square();
                        double sideOfSquare = square.getSide();
                        square.setSide(sideOfSquare);
                        square.area();
                        square.perimeter();
                        break;

                    case 5:
                        Sphere sphere = new Sphere();
                        double radiusOfSphere = sphere.getRadius();
                        sphere.setRadius(radiusOfSphere);
                        sphere.area();
                        sphere.volume();
                        break;

                    case 6:
                        Cylinder cylinder = new Cylinder();
                        double radiusOfCylinder = cylinder.getRadius();
                        cylinder.setRadius(radiusOfCylinder);
                        double heightOfCylinder = cylinder.getHeight();
                        cylinder.setHeight(heightOfCylinder);
                        cylinder.area();
                        cylinder.volume();
                        break;

                    default:
                        System.out.println("!! Wrong Choice Entered!");
                }

            }catch(NumberFormatException ex) {
                System.out.println("Please input a valid number....");
                ex.printStackTrace();
            }
        }while(choice!=7);

    }
}
