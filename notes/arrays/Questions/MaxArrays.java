package Questions;

public class MaxArrays {
    static void main() {
        int[] arr = {10,20,54,64,12,78};
        System.out.println("Max of array is "+maxArray(arr));
    }

    public static int maxArray(int[] arr){
        int max = arr[0];
        for(int i=0; i<arr.length;i++){
            if(arr[i]>=max)
                max = arr[i];
        }
        return max;
    }
}
