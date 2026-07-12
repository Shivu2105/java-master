package Questions;

import javax.sound.midi.SysexMessage;

public class SumArrays {
    static void main() {
        int[] num = {10,20,30,40,50};
        System.out.print("Sum of Arrays : "+ sumArray(num));
    }

    public static int sumArray(int[] arr){
        int sum = 0;
        for(int num :arr){
            sum += num;
        }
        return sum;
    }
}
