import java.util.*;

public class insertion_Sort {
    public static void insertion(int num[]){
        for (int i=1; i<num.length; i++){
            int curr = num[i];
            int prev = i-1;

            //finding out the correct position to insert
            while (prev>=0 && num[prev]>curr){
                prev--;
            }
            //insertion
            int j = i-1;
            while (j>prev){
                num[j+1] = num[j];
                j--;
            }
            num[prev+1] = curr;
        }
    }
    public static void main(String args[]){
        int num[]= {5,4,1,3,2};
        insertion(num);
        System.out.println(Arrays.toString(num));
    }
}