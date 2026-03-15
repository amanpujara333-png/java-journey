// File: E06_SumOfArray.java
// Class Name: E06_SumOfArray
// Purpose: Calculates sum of all elements in an array

public class E06_SumOfArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int sum = 0;

        for (int num : arr) {
            sum += num;
        }

        System.out.println("Sum of array elements: " + sum);
    }
}