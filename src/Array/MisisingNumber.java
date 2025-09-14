package Array;

import java.util.*;

public class MisisingNumber {
    public static void main(String[] args) {
        int input[] = {2,3,4,9,13,15,14,12,8,7};
        input = MissingNumberInArray(input);
        System.out.println(Arrays.toString(input));
    }
    static int[] MissingNumberInArray(int arr[]){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
            if(max<arr[i]){
                max = arr[i];
            }
            if(min>arr[i]){
                min = arr[i];
            }
        }
        List<Integer> list = new ArrayList<>();
        for(int i=min;i<max;i++){
            if(!set.contains(i)){
                list.add(i);
            }
        }
        int temp[] = new int[list.size()];
        for(int i=0;i<list.size();i++){
            temp[i] = list.get(i);
        }
        return temp;
    }
}
