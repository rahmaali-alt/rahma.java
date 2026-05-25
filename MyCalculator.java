import java.util.Scanner;
public class MyCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double num1, num2;
        char operator;
        double result;

        System.out.print("Ente first number: ");
        num1 = input.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        operator = input.next().charAt(0);

        System.out.print("Enter second number: ");
        num2 = input.nextDouble();

        
        switch (operator) {

            case '+':
                result = num1 + num2;
                System.out.println("Result = " + result);
                break;

            case '-':
                result = num1 - num2;
                System.out.println("Result = " + result);
                break;

            case '*':
                result = num1 * num2;
                System.out.println("Result = " + result);
                break;

            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result = " + result);
                } else {
                    System.out.println("Cannot divide by zero!");
                }
                break;

            default:
                System.out.println("Invalid operator!");
        }

        input.close();
    }
}