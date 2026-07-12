package Basics;

import java.util.Arrays;

public class ArrMethods {
    static void main(String[] args) {
        int[] arr = {10,5,3,6,12,17,1};

        int[] copy;
        

        System.out.println("Sorted Arrays: " );
        Arrays.sort(arr);// [1, 2, 5, 8, 9]
        System.out.println(Arrays.toString(arr) +" ");

        // Binary search (requires sorted array)
        int index = Arrays.binarySearch(arr, 5);
        System.out.println("Index of Element "+index );// Returns 2



        // Copy
        copy = Arrays.copyOf(arr, arr.length);
        int [] copyR = Arrays.copyOfRange(arr, 1, 4);
        System.out.println("Copied Arrays :"+copy+ " ");
        System.out.println("Copied Arrays Range: "+copyR +" ");// indices 1 to 3

        // Compare
        boolean isEqual = Arrays.equals(arr, copy);
        System.out.println("Output of Boolean");

        // Convert to string
        String str = Arrays.toString(arr);  // "[1, 2, 3, 4, 5]"
        System.out.print("String Arrays :"+str);

        // Fill
        Arrays.fill(arr, 0);
        System.out.println(arr);// [0, 0, 0, 0, 0]
        System.out.print("Filled array: " +arr);

    }
}
