<div align="center">

# Strings

</div>

### What are strings in java?
- In Java, a String is used to store and manipulate text (a sequence of characters).
Example: 

String name = "Shamli";
String message = "Hello World";

#### Input and Output of Strings:
Scanner sc = new Scanner(System.in);
String name;
name = sc.next();       //takes input till space (single word)
name = sc.nextLine();  // takes the entire line including spaces
System.out.println(name);

### Common Functions Performed on String in Java
- length() :Returns the number of characters in the string.
    Example:
    String s = "Java";
    System.out.println(s.length()); // 4

- charAt(int index) :Returns the character at a specified index.
    Example: 
    System.out.println(s.charAt(1)); // a

- toUpperCase() / toLowerCase() :Converts the string to upper or lower case.
    Example:
    System.out.println(s.toUpperCase()); // JAVA
    System.out.println(s.toLowerCase()); // java

- equals() / equalsIgnoreCase() :Used to compare the content of two strings.
   Example:
    String a = "Java";
    String b = "java";
    System.out.println(a.equals(b));            // false
    System.out.println(a.equalsIgnoreCase(b));  // true

- compareTo() :Compares two strings lexicographically (dictionary order).
    Example:
    "apple".compareTo("banana"); // negative

- substring() :Extracts a part of the string.
    Example:
    String s = "Programming";
    System.out.println(s.substring(0, 7)); // Program

- contains() :Checks whether a string contains a specific sequence.
    Example: 
    s.contains("gram"); // true

- indexOf() and lastIndexOf() :Returns the index of a character or substring.
    Example:s.indexOf('a');
    s.lastIndexOf('a');

- replace() :Replaces characters or substrings
    Example:
    s.replace('a', 'o');

- trim() :Removes extra spaces from the beginning and end of the string.
    Example:
    String s = "  Java  ";
    System.out.println(s.trim());

- split() :Splits the string into parts.
    Example:
    String s = "Java is easy";
    String[] arr = s.split(" ");

- startsWith() and endsWith() :Checks how a string starts or ends.
    Example:
    s.startsWith("Java");
    s.endsWith("easy");

- isEmpty() :Checks whether the string is empty.
    Example:
    String s = "";
    s.isEmpty(); // true

### Key Points:
   1. String is a Class
   2. Strings are Immutable(cannot be changed)
   3. Most string methods return a new String object.
