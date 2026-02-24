//Take 2 numbers as input and print the largest number.
import java.util.Scanner;
public class Practice5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a>b){
            System.out.println("a = " + a + " is the greatest number than b.");
        }
        else{
            System.out.println("b = " + b + " is the greatest number than a.");
        }
    }
}
