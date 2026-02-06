/*Kadane’s Algorithm finds the maximum sum subarray in linear time by discarding negative prefixes.

If the current sum becomes negative, drop it.
Start fresh from the next element.

Time Complexity: O(n)
Space Complexity: O(1)

*/

import java.util.*;

public class SubArraySum_Kadanes_Algo {

    public static void kadanes(int num[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < num.length; i++) {
            currSum += num[i];

            if (currSum < 0) {
                currSum = 0;
            }

            maxSum = Math.max(maxSum, currSum);
        }

        System.out.println("Max subarray sum is: " + maxSum);
    }

    public static void main(String args[]) {
        int num[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        kadanes(num);
    }
}








