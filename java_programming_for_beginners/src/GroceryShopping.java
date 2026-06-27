package java_programming_for_beginners.src;

import java.util.Scanner;

public class GroceryShopping {

    public static void main(String[] args) {

        String[] item = new String[10];
        float[] price = new float[10];
        // Populate the arrays with some sample data
        item[0] = "Apple";
        price[0] = 0.50f;
        item[1] = "Banana";
        price[1] = 0.30f;
        item[2] = "Bread";
        price[2] = 2.00f;
        item[3] = "Milk";
        price[3] = 1.50f;
        item[4] = "Eggs";
        price[4] = 2.50f;
        item[5] = "Cheese";
        price[5] = 3.00f;
        item[6] = "Chicken";
        price[6] = 5.00f;
        item[7] = "Rice";
        price[7] = 1.00f;
        item[8] = "Pasta";
        price[8] = 1.20f;
        item[9] = "Tomato";
        price[9] = 0.80f;

        Scanner scanner = new Scanner(System.in);

        try (scanner) {

            while (true) {
                String input = scanner.nextLine();

                if (input.equalsIgnoreCase("exit") || input.equalsIgnoreCase("finish")) {
                    System.out.println("Thanks to using the shopping cart, good bye.");
                    break;
                }

            }

        } catch (Exception e) {
            // TODO: handle exception
        }

    }

}
