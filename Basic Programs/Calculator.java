import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.print("enter two numbers and an operator.");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        char op = sc.next().charAt(0);

        switch (op) {
            case '+':
                System.out.print(a + b);
                break;
            case '-':
                System.out.print(a - b);
                break;
            case '*':
                System.out.print(a * b);
                break;
            case '/':
                System.out.print(a / b);
                break;
            case '%':
                System.out.print(a % b);
                break;
            default:
                System.out.print("enter a valid operator.");

        }

    }

}
