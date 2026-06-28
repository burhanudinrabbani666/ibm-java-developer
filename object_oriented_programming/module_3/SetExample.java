package object_oriented_programming.module_3;

import java.util.HashSet;
import java.util.TreeSet;

public class SetExample {
    public static void main(String[] args) {
        HashSet<String> colors = new HashSet<>(); // HashSet not allowed duplicate.

        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Red"); // Duplicate, This is automatically ignore.

        Integer count = 1;
        for (String color : colors) {
            System.out.println(count + ". " + color);
            count++;
        }

        // Sorted automaticallyc -> slower performance.
        TreeSet<Integer> numbers = new TreeSet<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(1);

        System.out.println(numbers);

    }

}
