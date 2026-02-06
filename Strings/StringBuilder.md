<div align="center">

# StringBuilder

</div>

### What is StringBuilder?
StringBuilder is a class in Java used to create mutable strings, which means the content of the string can be changed without creating new objects.

It is present in the java.lang package.


### Why StringBuilder?

String → Immutable (cannot be changed)

StringBuilder → Mutable (can be modified)

So, when you need to frequently modify strings, StringBuilder is a better choice.

Example
```
    StringBuilder sb = new StringBuilder("Java");
    sb.append(" Language");
    System.out.println(sb);

```

Output:

    Java Language

#### Common StringBuilder Methods
```text
1. append():Adds text at the end.
            - sb.append(" World");

2. insert():Inserts text at a specific position.
            - sb.insert(4, " is");

3. replace():Replaces characters in a given range.
            sb.replace(0, 4, "Python");

4. delete() / deleteCharAt():Removes characters.
            sb.delete(0, 2);
            sb.deleteCharAt(1);

5. reverse():Reverses the string.
            sb.reverse();

6. length(): Returns the length of the string.
             sb.length();

7. charAt(): Returns character at a given index.
             sb.charAt(2);

```