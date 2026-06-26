package java_programming_for_beginners.src;

public class Logical {
    public static void main(String[] args) {

        // Comparation
        byte a = 10;
        byte b = 5;

        System.err.println("Is a equal to b? " + (a == b));
        System.err.println("Is a equal to b? " + (a != b));
        System.err.println("Is a greater to b? " + (a > b));
        System.err.println("Is a less than equal to b? " + (a <= b));

        // Logical
        boolean x = true;
        boolean y = false;

        System.out.println("x AND y: " + (x && y));
        System.out.println("x OR y: " + (x || y));
        System.out.println("NOT x: " + (!x));

    }
}
