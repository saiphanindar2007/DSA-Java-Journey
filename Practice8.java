//To find out whether the given String is Palindrome or not.
import java.util.Scanner;
public class Practice8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        a = a.toLowerCase();
        int left = 0;
        int right = a.length() - 1;
        boolean isPalindrome = true;
        while(left<right){
            if(a.charAt(left) != a.charAt(right)){
                System.out.println("Not Possible");
                isPalindrome = false;
            }
            left++;
            right--;
        }
        if(isPalindrome){
            System.out.println(a + " is a palindrome.");
        }
    }
}
