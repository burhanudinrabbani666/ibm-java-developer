package java_programming_for_beginners.src.test_error;

import java.lang.ArithmeticException;
import java.lang.ArrayIndexOutOfBoundsException;

public class ArithmeticError {

    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3 };
        int index = 5;

        try {
            System.out.println("Number: " + numbers[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Error: index out of bounds.");
        } catch (ArithmeticException e) {
            System.out.println("Error: division by zero.");
        }

    }
}
