// File: D03_DiamondPattern.java
// Purpose: Prints a diamond pattern

public class D03_DiamondPattern {
    public static void main(String[] args) {
        int n = 5; // Number of rows for half diamond

        // Upper part
        for (int i = 1; i <= n; i++) {
            for (int j = n; j > i; j--)
                System.out.print(" ");
            for (int k = 1; k <= 2 * i - 1; k++)
                System.out.print("*");
            System.out.println();
        }

        // Lower part
        for (int i = n - 1; i >= 1; i--) {
            for (int j = n; j > i; j--)
                System.out.print(" ");
            for (int k = 1; k <= 2 * i - 1; k++)
                System.out.print("*");
            System.out.println();
        }
    }
}