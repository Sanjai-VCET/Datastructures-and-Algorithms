package BinarySearch;

import java.util.Arrays;

public class Search2DMatrix {
    public static void main(String[] args) {
        int arr[][] = {
                {1,4,7,11,15},
                {2,5,8,12,19},
                {3,6,9,16,22},
                {10,13,14,17,24},
                {18,21,23,26,30}
        };
        System.out.println(Arrays.toString(search(arr,3)));
    }
    static int[] search(int matrix[][] , int target){
        int row =0;
        int col = matrix.length-1;
        while(row< matrix.length && col >=0){
            if(matrix[row][col] == target){
                return new int[]{row,col};
            }
            if(matrix[row][col] <target){
                row++;
            }else{
                col--;
            }
        }
        return new int[]{-1,-1};
    }
}
