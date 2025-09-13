package Array;

public class MinMaxElement {
    public static void main(String[] args) {
        int input[] = {2,3,9,14,16,34,56,78};
        int result[] = MinMax(input);
        System.out.print("Minimum Number :"+ result[1] +", Maximum Element : "+result[0]);
    }
    static int[] MinMax(int arr[]){
        int res[] = new int[2];
        int min = arr[0];
        int max = arr[0];
        for(int i=0;i<arr.length;i++){
            max = Math.max(max , arr[i]);
            min = Math.min(min , arr[i]);
        }
        res[0] = max;
        res[1]= min;
        return res;
    }
}
