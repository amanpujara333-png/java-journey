// File: B07_SwapNumbers.java
// Class Name: B07_SwapNumbers
// Purpose: Demonstrates swapping two numbers in Java

public class B07_SwapNumbers {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        System.out.println("Before swap: a = " + a + ", b = " + b);

        // Swap using a temporary variable
        int temp = a;// store the value of a in temp 
        a = b;
        b = temp;

        System.out.println("After swap: a = " + a + ", b = " + b);
    }
}