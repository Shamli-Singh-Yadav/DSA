import java.util.Scanner;

public class ReverseUnit {
    public static void main(String args[]) {
        System.out.print("enter a number to reverse:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        while (num > 0) {
            int rev = 0;
            int lastdigit = num % 10;
            rev = (rev * 10) + lastdigit;
            num = num / 10;
            System.out.print(rev);
        }

    }

}
