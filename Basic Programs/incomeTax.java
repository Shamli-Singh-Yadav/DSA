import java.util.Scanner;

public class incomeTax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Income: ");
        int income = sc.nextInt();
        double tax = 0.0;

        if (income <= 10000) {
            tax = 0;
        } else if (income <= 30000) {
            tax = (income - 10000) * 0.10;
        } else if (income <= 60000) {
            tax = (20000 * 0.10) + (income - 30000) * 0.20;
        } else {
            tax = (20000 * 0.10) + (30000 * 0.20) + (income - 60000) * 0.30;
        }

        System.out.println("Your calculated tax is: " + tax);
        sc.close();
    }
}
