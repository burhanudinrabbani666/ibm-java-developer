package object_oriented_programming.module_3;

import java.util.HashSet;

public class SetExample {
    public static void main(String[] args) {
        HashSet<String> colors = new HashSet<>();

        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Red"); // Duplicate

        Integer count = 1;
        for (String color : colors) {
            System.out.println(count + ". " + color);
            count++;
        }

    }

}
