package Array;

public class CountRotation {
    public static void main(String[] args) {
        int arr[] = {5,6,7,0,1,2,3,4};
        int rotationCount = findRotationCount(arr);
        System.out.println("No of Rotation : " + rotationCount);
    }

    // Find the index of the minimum element (pivot)
    static int findRotationCount(int arr[]) {
        int start = 0;
        int end = arr.length - 1;
        if (arr[start] <= arr[end]) {
            return 0;
        }
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid + 1;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid;
            }
            if (arr[mid] >= arr[start]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return 0;
}
}
