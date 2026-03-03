import java.util.Scanner;

public class SumofEvenOdd {
    public static void main(String[] args) {

        int OddSum = 0;
        int EvenSum = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("enter your choice:");
        int choice = sc.nextInt();

        for (int i = 1; i <= choice; i++) {
            System.out.println("enter num:" + i);
            int num = sc.nextInt();

            if (num % 2 == 0) {
                EvenSum += num;
            } else {
                OddSum += num;
            }

        }
        System.out.println(EvenSum);
        System.out.println(OddSum);

    }

}
