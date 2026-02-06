//Jab array ke saare elements negative hote hain, tab Kadane’s algorithm ko first element se initialize kiya jata hai taki maximum negative element sahi answer mile.

import java.util.*;

public class Kadanes_specialCase {

    public static void kadanes(int arr[]) {
    int currSum = arr[0];
    int maxSum = arr[0];

    for (int i = 1; i < arr.length; i++) {
        currSum = Math.max(arr[i], currSum + arr[i]);
        maxSum = Math.max(maxSum, currSum);
    }

    System.out.println("Max subarray sum is: " + maxSum);
}

    public static void main(String args[]){
        int num[]= {-2,-3,-1,-4};
        kadanes(num);
    }
}
    

