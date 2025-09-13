package Array;

public class SecondLargestElement {
    public static void main(String[] args) {
        int input[] = {2,3,9,14,16,34,56,78};
        int result = SecondLargest(input);
        System.out.print("Second Largest Number "+ result);
    }
    static int SecondLargest(int arr[]){
        int max = arr[0];
        int prev = max ;
        for(int i=0;i<arr.length;i++){
            if(max < arr[i]){
                prev = max ;
                max = arr[i];
            }else if(max >arr[i] && prev <arr[i]){
                prev = arr[i];
            }
        }
        return prev ;
    }
}
