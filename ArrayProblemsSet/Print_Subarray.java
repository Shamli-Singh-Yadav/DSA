import java.util.*;

 //what is a subarray?
//subarray is a continous part of an array

public class Print_Subarray{

    public static void PrintSubarrays(int numbers[]){
        int ts=0; // total subarrays
        for (int i=0; i<numbers.length; i++){
            int start = i;
            for(int j=i; j<numbers.length; j++){
                int end=j;
                for(int k=start; k<=end; k++){
                    System.out.print(numbers[k] + " ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total subarrays: " + ts);
    }
    public static void main(String args[]){
        int numbers[]= {2,4,6,8,10};
        PrintSubarrays(numbers);
    }
}

//t.c= O(n^3)
//s.c= O(1)
//total number of subarrays= n(n+1)/2