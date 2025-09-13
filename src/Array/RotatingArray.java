package Array;

import java.util.*;
public class RotatingArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int k = 3; //Number of Rotation
        int n = arr.length-1;
       arr =  ReverseArray(arr ,0 ,n);
       arr =  ReverseArray(arr , 0,k-1);
       arr =  ReverseArray(arr , k,n);
        System.out.println(Arrays.toString(arr));
    }
    static int[] ReverseArray(int[] arr , int left , int right) {
         while(left<right){
             int temp = arr[left];
             arr[left] = arr[right];
             arr[right] = temp;
             left++;
             right--;
         }
          return arr;
    }
}
