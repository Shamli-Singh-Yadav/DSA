import java.util.*;

public class Pairs_in_array{
    public static  void PrintPairs( int numbers[]){
        int tp=0; // total pairs
        for(int i=0; i<numbers.length;i++){
            int curr = numbers[i];
            for(int j=i+1; j<numbers.length; j++){
                System.out.print("("+ curr + "," + numbers[j] +") ");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total pairs: " + tp);
    }
    public static void main(String args[]){
        int numbers[]= { 2,8,9};
        PrintPairs(numbers);
    }
}


//to find totalumber of pairs in an array:n(n-1)/2
//t.c= O(n^2)