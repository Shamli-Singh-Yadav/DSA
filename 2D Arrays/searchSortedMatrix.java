// search for a key in row wise and col wise sorted matrix

import java.util.*;

public class searchSortedMatrix {

    public static boolean search(int matrix[][], int key) {
        int row = 0;
        int col = matrix[0].length - 1;

        while(row < matrix.length && col >= 0){
            if(matrix[row][col] == key){
                System.out.println("Found at (" + row + ", " + col + ")");
                return true;
            }
            else if(matrix[row][col] < key){
                row++;
            }
            else{
                col--;
            }
        }
        System.out.println("Not found");
        return false;
    }

    public static void main(String args[]){
        int matrix[][] ={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        int key = 5;
        System.out.println(search(matrix, key));
    }
}

