// File: D04_FloydTriangle.java
// Purpose: Prints Floyd's triangle pattern

public class D04_FloydTriangle {
    public static void main(String[] args) {
        int n = 5; // Number of rows
        int num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}