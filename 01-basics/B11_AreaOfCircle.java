// File: B11_AreaOfCircle.java
// Class Name: B11_AreaOfCircle
// Purpose: Calculate area of a circle

import java.util.Scanner;

public class B11_AreaOfCircle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius of the circle: ");
        double radius = sc.nextDouble();

        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle = " + area);

        sc.close();
    }
}