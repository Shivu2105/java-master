package Questions;

import java.util.Arrays;

public class RemoveDuplicates {
    static void main() {
        int[] arr = {1,1,2,3,4,2,1,2,6};

        int n = arr.length;
        int[] temp= new int[n];
        int j =0;

        for(int i=0;i<n;i++){
            boolean duplicateArray = false;

            for(int k=0; k<j; k++){
                if(temp[k] == arr[i]) {
                    duplicateArray = true;
                    break;
                }
            }

            if(!duplicateArray){
                temp[j] = arr[i];
                j++;
            }
        }

        System.out.println("Unique Arrays"+ Arrays.toString(temp));

    }
}
