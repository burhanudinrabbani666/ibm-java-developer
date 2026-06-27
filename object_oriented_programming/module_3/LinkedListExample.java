package object_oriented_programming.module_3;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> animals = new LinkedList<>();

        animals.add("Cat");
        animals.add("Dog");
        animals.add("Cow");

        Integer count = 1;
        for (String animal : animals) {
            System.out.println(count + ". " + animal);
            count++;
        }

    }
}
