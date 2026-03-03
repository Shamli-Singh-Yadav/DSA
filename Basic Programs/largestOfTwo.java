import java.util.Scanner;

public class largestOfTwo {
    public static void main(String[] args) {
        System.out.println("enter a number ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        System.out.println("enter a number ");
        int b = sc.nextInt();

        if (a < b) {
            System.out.println("b is the largest number.");

        } else {
            System.out.println("a is the largest number.");
        }

    }

}
