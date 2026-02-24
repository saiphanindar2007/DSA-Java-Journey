//To find Armstrong Number between two given number.
import java.util.Scanner;
public class Practice9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter range (start end): ");
        int start = sc.nextInt();
        int end = sc.nextInt();
        for (int i = start; i <= end; i++) {
            int originalNumber = i;
            int temp = i, sum = 0, digits = 0;
            // Count digits
            while (temp > 0) {
                temp /= 10;
                digits++;
            }
            temp = i; // Reset
            // Calculate sum of powers
            while (temp > 0) {
                int digit = temp % 10;
                int power = 1;
                for (int j = 0; j < digits; j++) power *= digit;
                sum += power;
                temp /= 10;
            }
            if (sum == originalNumber) System.out.println(originalNumber);
        }
        sc.close();
    }
}
