package java_programming_for_beginners.src;

public class Arrays {
    public static void main(String[] args) {

        int[] numbers = { 1, 2, 3, 4, 5 };
        for (int number : numbers) {
            System.err.println(number);
        }

        int[][] matrix = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 },
        };

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {
                System.err.println(matrix[i][j] + " ");
            }

            System.err.println(" ");

        }

    }
}
