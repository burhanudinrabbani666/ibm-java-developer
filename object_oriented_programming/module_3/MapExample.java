package object_oriented_programming.module_3;

import java.util.HashMap;

public class MapExample {
    public static void main(String[] args) {

        HashMap<String, Integer> ageMap = new HashMap<>();

        // Adding key-value pairs
        ageMap.put("Bani", 23);
        ageMap.put("Heri", 22);
        ageMap.put("Jokowi", 70);

        Integer baniAge = ageMap.get("Bani");
        System.out.println("Bani age's: " + baniAge);

    }
}
