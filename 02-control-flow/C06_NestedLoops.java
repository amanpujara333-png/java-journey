// File: C06_NestedLoops.java
// Class Name: C06_NestedLoops
// Purpose: Demonstrates nested loops in Java

public class C06_NestedLoops {
    public static void main(String[] args) {
        System.out.println("Printing a 5x5 star pattern using nested loops:");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}