package BinarySearch;

public class FindFloor {
    public static void main(String[] args) {
        int input[] = {2,3,9,14,16,34,56,78};
        int target = 24; // Target Value
        int result = FindFloorValue(input , target);
        System.out.print("Celing Number "+ result);
    }
    static int FindFloorValue(int arr[],int target){
        int left =0;
        int right = arr.length-1;
        while(left<=right){
            int mid = (left + right)/2;
            if(arr[mid]==target){
                return mid;
            }else if(arr[mid]<target){
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        return arr[right];
    }
}
