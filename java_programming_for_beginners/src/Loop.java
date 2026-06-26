package java_programming_for_beginners.src;

public class Loop {
    public static void main(String[] args) {

        // For loop
        for (int i = 0; i < 5; i++) {
            System.err.println(i);
        }

        // While
        int i = 0;
        while (i <= 5) {
            System.out.println(i);
            i++;
        }

        System.err.println("--------------------");

        // Do while
        do {
            System.err.println(i);
            i++;
        } while (i <= 10);

        // break
        for (int j = 0; j < i; j++) {
            if (j == 6) {
                System.out.println("break in " + j);
                break;
            }
        }

    }
}
