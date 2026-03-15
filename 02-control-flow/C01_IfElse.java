// File: C01_IfElse.java
// Class Name: C01_IfElse
// Purpose: Demonstrates basic if-else conditional statements

public class C01_IfElse {
    public static void main(String[] args) {
        int number = 10;

        if (number > 0) {
            System.out.println(number + " is positive.");
        } else if (number < 0) {
            System.out.println(number + " is negative.");
        } else {
            System.out.println(number + " is zero.");
        }
    }
}