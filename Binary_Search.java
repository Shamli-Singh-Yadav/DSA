import java.util.*;

public class Binary_Search {
    public static int binarySearch(int[] arr, int key) {

        int start = 0, end = arr.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2; // Mid calculation (safe from overflow)

            // Case 1: target found
            if (arr[mid] == key) {
                return mid;
            }

            // Case 2: target in right half
            if (arr[mid] < key) {
                start = mid + 1;
            }
            // Case 3: target in left half
            else {
                end = mid - 1;
            }
        }

        // Target not found
        return -1;
    }

    public static void main(String[] args) {
        int arr[]= {2, 4,6,8,9,10,12,14,16,18,20};
        int key =14;
        System.out.println("Index for key is: " + binarySearch(arr, key));

}
}
