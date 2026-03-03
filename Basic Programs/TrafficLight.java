import java.util.Scanner;

public class TrafficLight {
    public static void main(String args[]) {
        System.out.print("enter colours :(red,yellow or green):");
        Scanner sc = new Scanner(System.in);
        String Light = sc.next();
        switch (Light) {

            case "red":
                System.out.println("Stop");
                break;

            case "yellow":
                System.out.println("wait");
                break;

            case "green":
                System.out.println("go");
                break;

            default:
                System.out.println("enter a valid colour.");
        }
    }

}
