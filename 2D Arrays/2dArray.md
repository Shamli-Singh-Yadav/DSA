<div align="center">

# 2D array

</div>

### What is 2D array?

- A 2D array in Java is an array of arrays.
It is used to store data in the form of rows and columns, similar to a table or matrix.

- Declaration of 2D array
int[][] arr;

- Creation of 2D array
int[][] arr = new int[3][3];

- Initialization of 2D array
int[][] arr = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};

- Accessing elements
System.out.println(arr[0][0]); // 1
System.out.println(arr[1][2]); // 6

- Traversing a 2D Array
for (int i = 0; i < arr.length; i++) {
    for (int j = 0; j < arr[i].length; j++) {
        System.out.print(arr[i][j] + " ");
    }
    System.out.println();
}


## Why Use 2D Arrays?
- To represent matrices
- To store table-like data
- Used in games, graphs, and image processing

#### Complexity
- Accessing an element: O(1)
- Traversing the array: O(rows × columns)


#### 2D Arrays in Memory
In Java, a 2D array is not stored as a single continuous block.
Instead, it is stored as an array of arrays.

This means:
- The main array stores references
- Each row is a separate 1D array in memory

