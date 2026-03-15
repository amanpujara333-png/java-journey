// File: E01_ArrayBasics.java
// Class Name: E01_ArrayBasics
// Purpose: Demonstrates basic array declaration, initialization, and iteration in Java

public class E01_ArrayBasics {
    public static void main(String[] args) {
        // Declare and initialize an array
        int[] numbers = {10, 20, 30, 40, 50};

        // Print array elements
        System.out.println("Array elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Index " + i + ": " + numbers[i]);
        }
    }
}