package java_programming_for_beginners.src.test_error;

import java.util.Scanner;
import java.lang.NumberFormatException;

public class UserInputError {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");

        try (scanner) {
            String input = scanner.nextLine();
            int number = Integer.parseInt(input); // May throw NumberFormatExecption

            System.out.println("You entered: " + number);

        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter a valid number");
        } finally {
            scanner.close();
        }
    }

}
