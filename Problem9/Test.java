package Problem9;

import java.util.Scanner;

public class Test {
    
    public static void main(String[] args){
        /*Scanner input = new Scanner(System.in);
        Triangle t;
        
        System.out.print("Side 1 : ");
        double side1 = input.nextDouble();

        System.out.print("Side 2 : ");
        double side2 = input.nextDouble();

        System.out.print("Side 3 : ");
        double side3 = input.nextDouble();

        System.out.print("Color : ");
        String color = input.next();

        System.out.print("Filled : ");
        Boolean filled = input.nextBoolean();

        input.close();
        t = new Triangle(side1,side2,side3,color,filled);
        t.display(t);*/


        Circle circle = new Circle(7);
        circle.display(circle);

        Rectangle rectangle = new Rectangle(10,5);
        rectangle.display(rectangle);
    }
}
