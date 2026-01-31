import java.util.*;

public class largestNum {
    public static int getLargest(int numbers[]){
        int largest = Integer.MIN_VALUE;   // -infinity (for finding largest number)
        
        /*to find a smallest number write int smallest = Integer.MAX_VALUE;
        if(numbers[i] < smallest){
            smallest = numbers[i];*/

        for(int i=0; i<numbers.length; i++){
            if(numbers[i] > largest){
                largest = numbers[i];
            }
        }
        return largest;
    }

    public static void main(String args[]){
        int numbers[] = {1, 4, 3, 5, 6, 7, 2};
        System.out.println("The largest number in the array is: " + getLargest(numbers));
    }
}


//t.c= O(n)
