package Basics;

public class ArrIterations {
    static void main() {

        int[] arr = new int[5];
        int[] numbers = {10, 20, 30, 40, 50};
        String[] names = new String[3];

        arr[0]=10;

        //Iteration patterns

        //Pattern 1 Basic for loops
        for(int i=0; i<numbers.length; i++)
            System.out.println("Content of Array Number :"+numbers[i] + " ");

        //Pattern 2 Enhanced For Loop
        System.out.println("All by Enhanced Loops");
        for(int num : numbers)
            System.out.print(num+" ");

        // Pattern 3: Reverse iteration
        System.out.println("All by Reverse Iterations Loops");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i]+" ");
        }

// Pattern 4: Using while loop
        System.out.println("All by While Loops");
        int i = 0;
        while (i < numbers.length) {
            System.out.print(numbers[i++]+" ");
        }
    }
}
