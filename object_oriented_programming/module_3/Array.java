package object_oriented_programming.module_3;

import java.util.ArrayList;
import java.util.List;

public class Array {
    public static void main(String[] args) {
        // Creating a list
        List<String> fruits = new ArrayList<>();

        // Adding elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Chery");

        System.out.print("List of fruits: \n");
        for (int i = 1; i <= fruits.size(); i++) {
            System.out.println(i + ". " + fruits.get(i - 1));
        }

    }
}
