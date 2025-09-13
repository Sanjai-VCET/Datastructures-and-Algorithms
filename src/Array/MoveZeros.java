package Array;

import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        int input[] = { 0,2,4,0,0,4,12,0,0,9};
        input = Move(input);
        System.out.print(Arrays.toString(input));
    }
    static int[] Move(int[]arr){
        int left =0 ;
        for(int right=1;right<arr.length;right++){
            if(arr[left] == 0 && arr[right] !=0){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

            }
            if(arr[left]!=0){
                left++;
            }

        }
        return arr;
    }
}
