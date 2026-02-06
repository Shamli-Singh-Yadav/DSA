import java.util.*;

public class selection_Sort {
    public static void selection(int num[]){
        for (int i=0; i<num.length-1; i++){
            int minPos = i;
            for (int j=i+1; j<num.length; j++){
                if (num[minPos]>num[j]){
                    minPos = j;
                }
            }
            //swap
            int temp = num[minPos];
            num[minPos] = num[i];
            num[i] = temp;
        }
    }
    public static void main(String args[]){
        int num[]= {5,4,1,3,2};
        selection(num);
        System.out.println(Arrays.toString(num));
    }
}