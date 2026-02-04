//A prefix array is a separate new array, not the original one.
//This new array stores the cumulative sum of the original array el  ements.

import java.util.*;

public class SubArraySum_Prefix_sum{

    public static void maxSubarraySum(int numbers[]){
        
        int currSum= 0;
        int maxSum= Integer.MIN_VALUE;
        int prefix[]= new int[numbers.length];

        //calculate prefix array
        for(int i=1; i<prefix.length; i++){
            prefix[i]= prefix[i-1] + numbers[i];
        }

        for (int i=0; i<numbers.length; i++){
            int start = i;
            for(int j=i; j<numbers.length; j++){
                int end=j;

                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];

                if( maxSum < currSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Max subarray sum is: " + maxSum);
    }
    public static void main(String args[]){
        int numbers[]= {2,4,6,8,10};
        maxSubarraySum(numbers);
    }
}

//t.c= O(n^2)
//s.c= O(n)
