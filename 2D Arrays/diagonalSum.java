import java.util.*;

public class diagonalSum {

    public static int diagonalsum(int matrix[][]) {
        int sum = 0;
        for(int i = 0; i < matrix.length; i++){
            // primary diagonal
            sum += matrix[i][i];

            // secondary diagonal
            if(i != matrix.length - 1 - i){
                sum += matrix[i][matrix.length - 1 - i];
            }
        }
        return sum;
    }

    public static void main(String args[]){
        int matrix[][] ={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        System.out.println(diagonalsum(matrix));
    }
}

//t.c : O(n^2)

/*optimized solution t.c=O(n)

for(int i = 0; i < matrix.length; i++){
    sum += matrix[i][i]; // primary diagonal
    if(i != matrix.length - 1 - i){
        sum += matrix[i][matrix.length - 1 - i]; // secondary diagonal
    }
}

*/