//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
import java.util.Scanner;
public class Practice3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float P = scanner.nextFloat();
        float R = scanner.nextFloat();
        float T = scanner.nextFloat();
        float SI = (P*R*T)/100;
        System.out.println("Simple Interest = " + SI);
    }
}
