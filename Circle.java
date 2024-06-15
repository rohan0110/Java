package rohan;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        double r = sc.nextDouble();
        double area = area(r);
        System.out.println("The area of the circle is " + area);
        double perimeter = perimeter(r);
        System.out.println("The perimeter of the circle is " + perimeter);
    }
    static double area(double r) {
        return Math.PI * Math.pow(r, 2);
    }
    static double perimeter(double r) {
        return 2 * Math.PI * r;
    }
}
