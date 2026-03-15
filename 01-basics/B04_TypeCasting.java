// File: 04_TypeCasting.java
// Class Name: B04_TypeCasting
// Purpose: Demonstrates implicit and explicit type casting in Java

public class B04_TypeCasting {

    public static void main(String[] args) {

        // Implicit casting: int -> double
        int i = 100;
        double d = i; // automatic conversion
        System.out.println("Implicit Casting int to double: " + d);

        // Explicit casting: double -> int
        double x = 9.78;
        int y = (int) x; // manual conversion using (int)
        System.out.println("Explicit Casting double to int: " + y);
    }
}