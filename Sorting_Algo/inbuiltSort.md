# Inbuilt Sort

Java provides inbuilt (already available) sorting methods that help us sort data easily without writing our own sorting algorithms.
<br>
import java.util.Arrays;<br>
Arrays.sort(arr)<br>
or <br>
Arrays.sort(arr, si,ei) <br>
si:starting index of arr.<br>
ei:ending index of arr.<br>


- Arrays.sort() is used to sort arrays in Java.<br>
      - Time: O(n log n)<br>
      - Space: O(1) to O(n) (depends on data type)<br>



import java.util.Collections;<br>
Arrays.sort(arr,si,ei,Collections.reverseOrder())<br>
or<br>
Arrays.sort(arr, Collections.reverseOrder())<br>

- Collections.sort() is used to sort List collections like ArrayList. <br>
     - Time: O(n log n)<br>
     - Space: O(n)



