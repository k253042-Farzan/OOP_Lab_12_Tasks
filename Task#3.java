import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Enter first number: ");
            String num1Str = input.nextLine();
            if (num1Str == null || num1Str.trim().isEmpty()) {
                throw new IllegalArgumentException("First number cannot be empty.");
            }

            double num1 = Double.parseDouble(num1Str);
            System.out.print("Enter second number: ");
            String num2Str = input.nextLine();

            if (num2Str == null || num2Str.trim().isEmpty()) {
                throw new IllegalArgumentException("Second number cannot be empty.");
            }
            double num2 = Double.parseDouble(num2Str);
            System.out.print("Enter operation (+, -, *, /): ");
            String operation = input.nextLine();

            double result = 0;
            switch (operation) {

                case "+":
                    result = num1 + num2;
                    break;

                case "-":
                    result = num1 - num2;
                    break;

                case "*":
                    result = num1 * num2;
                    break;

                case "/":
                    if (num2 == 0) {
                        throw new ArithmeticException("Cannot divide by zero.");
                    }
                    result = num1 / num2;
                    break;

                default:
                    System.out.println("Invalid operation entered.");
                    return;
            }

            System.out.println("Result = " + result);

        }
        catch (NumberFormatException e) {
            System.out.println("Error: Please enter valid numeric values.");
        }
        catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
        catch (Exception e) {
            System.out.println("Unexpected Error: " + e.getMessage());
        }

        finally {
            input.close();
        }
    }
}