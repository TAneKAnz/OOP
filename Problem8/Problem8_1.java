package Problem8;

import java.util.Scanner;

public class Problem8_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter side 1 of a triangle: ");
        double side1 = input.nextInt();
        System.out.print("Enter side 2 of a triangle: ");
        double side2 = input.nextInt();
        System.out.print("Enter side 3 of a triangle: ");
        double side3 = input.nextInt();
        System.out.printf("Enter a color: ");
        String color = input.next();
        System.out.print("Is the triangle filled? true/false: ");
        boolean isFilled = input.nextBoolean();

        System.out.println();

        Triangle t = new Triangle(side1, side2, side3, color, isFilled);
        if (t.getArea() > 0)
            System.out.println(t);
        else
            System.out.println("Error : The sum of two sides must be larger than the third to make the triangle.");
        input.close();
    }
}