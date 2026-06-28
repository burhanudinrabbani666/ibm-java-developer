package object_oriented_programming.module_3;

import java.util.ArrayList;

public class ListExample {
    public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList<>();

        // add elements
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("manggo");

        // Access element
        System.out.println(fruits.get(0));

        // Delete element
        fruits.remove("banana");

        System.out.println("Fruits list: " + fruits);
    }
}
