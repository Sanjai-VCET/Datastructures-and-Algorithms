package BinarySearch;

public class FindPeakElement {
    public static void main(String[] args) {
        int input[] = {2,3,9,14,16,34,56,78};

        int result = FindPeakNumber(input);
        System.out.print("Peak Number "+ result);
    }
    static int FindPeakNumber(int arr[]){
        int start =0;
        int end = arr.length;
        while(start<end){
            int mid = start + (end-start)/2;
            if(arr[mid]>arr[mid+1]){
                end = mid;
            }else if(arr[mid]<arr[mid+1]){
                start = mid+1;
            }
        }
        return start;
    }
}
