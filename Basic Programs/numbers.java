import java.util.Scanner;

public class numbers {
    public static void main(String args[]) {
        System.out.println("numbers from 1 to 10");
        for (int num = 1; num <= 10; num++) {
            System.out.println(num);
        }

        System.out.print("enter a number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }

}
