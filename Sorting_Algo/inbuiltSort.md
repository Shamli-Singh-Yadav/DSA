# Inbuilt Sort

Java provides inbuilt (already available) sorting methods that help us sort data easily without writing our own sorting algorithms.

import java.util.Arrays;
Arrays.sort(arr)
or 
Arrays.sort(arr, si,ei) 
si:starting index of arr.
ei:ending index of arr.


- Arrays.sort() is used to sort arrays in Java.
      - Time: O(n log n)
      - Space: O(1) to O(n) (depends on data type)



import java.util.Collections;
Arrays.sort(arr,si,ei,Collections.reverseOrder())
or
Arrays.sort(arr, Collections.reverseOrder())

- Collections.sort() is used to sort List collections like ArrayList. 
     - Time: O(n log n)
     - Space: O(n)



