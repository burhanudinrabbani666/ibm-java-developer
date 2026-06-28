package object_oriented_programming.module_3;

import java.util.HashMap;
import java.util.TreeMap;

public class MapExample {
    public static void main(String[] args) {

        HashMap<String, Integer> ageMap = new HashMap<>();
        // Adding key-value pairs
        ageMap.put("Bani", 23);
        ageMap.put("Heri", 22);
        ageMap.put("Jokowi", 70);
        Integer baniAge = ageMap.get("Bani");
        System.out.println("Bani age's: " + baniAge);

        HashMap<String, Object> users = new HashMap<>();
        users.put("firstName", "burhanudin");
        users.put("lastName", "Rabbani");
        users.put("age", 23);
        users.put("isMaried", false);
        System.out.println(users);

        HashMap<String, Integer> wordCount = new HashMap<>();
        String text = "apple banana apple orange banana apple";
        String[] fruits = text.split(" ");
        for (String fruit : fruits) {
            wordCount.put(fruit,
                    wordCount.getOrDefault(fruit, 0) + 1);
        }
        System.out.println(wordCount);

        // Treemap -> order value
        TreeMap<String, Integer> leaderboard = new TreeMap<>();
        leaderboard.put("bani", 100);
        leaderboard.put("farhan", 80);
        leaderboard.put("risal", 50);
        leaderboard.put("aziz", 120);

        for (String player : leaderboard.keySet()) {

            System.out.println(player + ": " + leaderboard.get(player));

        }

    }
}
