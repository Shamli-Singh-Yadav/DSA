import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a > b && a > c) {
            System.out.println("A is the largest number.");
        } else if (b > a && b > c) {
            System.out.println("B is the largest number.");
        } else if (c > a && c > b) {
            System.out.println("C is the largest number.");
        } else {
            System.out.println("Two or more numbers are equal and largest.");
        }

        sc.close();
    }
}
