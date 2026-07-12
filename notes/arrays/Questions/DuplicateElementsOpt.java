package Questions;

import java.util.Arrays;

public class DuplicateElementsOpt {


    public static void main(String[] args) {

        int[] arr = {1, 1, 2, 2, 2, 3, 4, 4, 5};
        int size = removeDuplicate(arr);

        System.out.println("Sorted Array :");
        for(int i=0; i<size ;i++){
            System.out.println(arr[i]);
        }
    }

    public static int removeDuplicate(int[] arr){
        int uniqueIndex =0;
        for(int i =1; i<arr.length;i++){
            if(arr[i] != arr[uniqueIndex]){
                uniqueIndex++;
                arr[uniqueIndex] = arr[i];

            }
        }
        return uniqueIndex+1;
    }
}