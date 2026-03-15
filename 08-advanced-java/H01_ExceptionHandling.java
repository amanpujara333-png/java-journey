// File: H01_ExceptionHandling.java
// Class Name: H01_ExceptionHandling
// Purpose: Demonstrates try-catch-finally blocks and exception handling in Java

public class H01_ExceptionHandling {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; // This will throw ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Caught exception: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed.");
        }
    }
}