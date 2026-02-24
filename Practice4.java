//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
import java.util.Scanner;
public class Practice4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2, result = 0;
        char operator;
        boolean validOperation = true;
        System.out.print("Enter the first number: ");
        num1 = scanner.nextDouble();
        System.out.print("Enter an operator (+, -, *, /): ");
        operator = scanner.next().charAt(0); 
        System.out.print("Enter the second number: ");
        num2 = scanner.nextDouble();
        if (operator == '+') {
            result = num1 + num2;
        } else if (operator == '-') {
            result = num1 - num2;
        } else if (operator == '*') {
            result = num1 * num2;
        } else if (operator == '/') {
            if (num2 != 0) {
                result = num1 / num2;
            } else {
                System.out.println("Error: Division by zero is not allowed.");
                validOperation = false;
            }
        } else {
            System.out.println("Error: Invalid operator. Please use +, -, *, or /.");
            validOperation = false;
        }
        if (validOperation) {
            System.out.println("Result: " + num1 + " " + operator + " " + num2 + " = " + result);
        }
        scanner.close(); 
    }
}
