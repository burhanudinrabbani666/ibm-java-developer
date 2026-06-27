package java_programming_for_beginners.src;

import java.lang.Exception;

/**
 * InnerException
 */
class MyCustomException extends Exception {
    public MyCustomException(String message) {
        super(message);
    }
}

public class MyCustomExceptionExample {
    public static void main(String[] args) {
        try {
            throw new MyCustomException("This is a custom exception mesage");
        } catch (MyCustomException e) {
            System.out.println(e.getMessage());
        }
    }
}
