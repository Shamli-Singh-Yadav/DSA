import java.util.Scanner;

public class Cost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();
        float bill = pencil + pen + eraser + 0.18f; //0.18f is GST
        System.out.println(bill);
    }

}
