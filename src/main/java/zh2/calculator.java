package zh2;

import java.util.Scanner; // Import the Scanner class to get user input

public class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number1, number2, result = 0;
        char operator;

        // Prompt user for numbers and operator
        System.out.println("Enter first number:");
        number1 = scanner.nextDouble(); // Read the first number

        System.out.println("Enter second number:");
        number2 = scanner.nextDouble(); // Read the second number

        System.out.println("Choose an operator: +, -, *, or /");
        operator = scanner.next().charAt(0); // Read the operator character

        // Use a switch statement to perform the correct operation
        switch (operator) {
            case '+':
                result = number1 + number2;
                break;
            case '-':
                result = number1 - number2;
                break;
            case '*':
                result = number1 * number2;
                break;
            case '/':
                if (number2 != 0) { // Check for division by zero error
                    result = number1 / number2;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    return; // Exit the program on error
                }
                break;
            default:
                System.out.println("Error: Invalid operator entered.");
                return; // Exit the program on error
        }

        // Print the result
        System.out.println(number1 + " " + operator + " " + number2 + " = " + result);

        scanner.close(); // Close the scanner to prevent resource leaks
    }
}
