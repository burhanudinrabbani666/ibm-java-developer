package java_programming_for_beginners.src;

public class Conditional {
    public static void main(String[] args) {

        int number = 3;
        if (number == 5) {
            System.err.println("The number is equeal 5");
        } else if (number > 5) {
            System.out.println("The number is greater than 5.");
        } else {
            System.err.println("The number is less than 5");
        }

        String day = "monday";
        switch (day) {
            case "monday":
                System.err.println("Monday");
                break;

            case "tuesday":
                System.err.println("Tuesday");
                break;

            case "wednesday":
                System.err.println("Wednesday");
                break;

            case "thursday":
                System.err.println("Thursday");
                break;

            case "friday":
                System.err.println("Friday");
                break;

            default:
                System.err.println("Weekend");
                break;
        }

    }
}
