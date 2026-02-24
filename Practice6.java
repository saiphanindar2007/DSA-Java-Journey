//Input currency in rupees and output in USD.
import java.util.Scanner;
public class Practice6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float rupees = sc.nextFloat();
        float USD = rupees/(float)(90.73);
        System.out.println(rupees + " rupees is " + USD + "USD.");
    }
}
