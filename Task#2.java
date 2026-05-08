import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String str = input.nextLine();

        try {
            if (str == null || str.trim().isEmpty()) {
                throw new Exception("Error: Input is null or empty.");
            }
            int n = Integer.parseInt(str);

            if (n < 0) {
                throw new Exception("Error: Negative numbers are not allowed.");
            }

            int fact = 1;
            for (int i = 1; i <= n; i++) {
                if (fact > Integer.MAX_VALUE / i) {
                    throw new ArithmeticException("Error: Integer overflow. Number is too large.");
                }
                fact = fact * i;
            }
            System.out.println("Factorial of " + n + " = " + fact);

        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid integer input.");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        input.close();
    }
}
