// File: E05_MaxMinElement.java
// Class Name: E05_MaxMinElement
// Purpose: Finds the maximum and minimum element in an array

public class E05_MaxMinElement {
    public static void main(String[] args) {
        int[] arr = {4, 8, 1, 9, 5};

        int max = arr[0];
        int min = arr[0];

        for (int num : arr) {
            if (num > max) max = num;
            if (num < min) min = num;
        }

        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
    }
}