import java.util.Scanner;

public class Student {
    public static void main(String args[]) {
        System.out.println("Enter your Marks:");
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        String rep = marks <= 33 ? "fail" : "pass";
        System.out.println(rep);

    }

}
