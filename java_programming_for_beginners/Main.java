import java_programming_for_beginners.src.test.Users;
import java.time.*;

public class Main {

    public static void main(String[] args) {

        Users newUsers = new Users("burhanudin rabbani");
        newUsers.greeting();

        System.err.println(LocalDate.now());
    }
}
