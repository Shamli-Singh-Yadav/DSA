import java.util.Scanner;

public class number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num < 0) {
            System.out.println("It is a negative number.");
        } else if (num == 0) {
            System.out.println("It is a zero.");
        } else {
            System.out.println("It is a positive number.");

        }
    }

}
