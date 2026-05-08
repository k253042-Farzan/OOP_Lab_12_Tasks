import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter list of values separated by space: ");
        String data = input.nextLine();

        try {
            if (data == null || data.trim().isEmpty()) {
                throw new Exception("Error: List is null or empty.");
            }

            String[] values = data.split(" ");
            int sum = 0;
            int count = 0;

            for (String item : values) {
                try {
                    int num = Integer.parseInt(item);
                    sum += num;
                    count++;
                } catch (NumberFormatException e) {
                    System.out.println(item + " is invalid and skipped.");
                }
            }
            if (count == 0) {
                throw new Exception("Error: List contains only invalid integers.");
            }
            double average = (double) sum / count;
            System.out.println("Average of valid integers = " + average);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        input.close();
    }
}