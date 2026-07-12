package Questions;

import java.util.Arrays;

public class Reversal {
    static void main() {
        int [] numbers = {1,2,3,4,5,6};
        reverseArray(numbers);
        System.out.println(Arrays.toString(numbers));
    }

    public static void reverseArray(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
}
