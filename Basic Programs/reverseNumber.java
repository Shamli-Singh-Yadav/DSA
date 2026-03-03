import java.util.Scanner;

public class reverseNumber {
    public static void main(String args[]) {
        System.out.print("Enter a number:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        do {
            int a = num % 10;
            System.out.print(a);
            num = num / 10;
        } while (num > 0);

    }

}
