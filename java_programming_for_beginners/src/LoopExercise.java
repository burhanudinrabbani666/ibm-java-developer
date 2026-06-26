package java_programming_for_beginners.src;

public class LoopExercise {
    public static void main(String[] args) {

        byte[] nums = { 1, 2, 3 };

        System.err.println(nums[0]);
        System.err.println(nums[1]);
        System.err.println(nums[2]);

        System.err.println("Using for loop");
        for (byte num : nums) {
            System.err.println(num);
        }

        String name = "rabbani";
        char[] nameArray = name.toCharArray();

        for (char nameChar : nameArray) {
            System.err.println(nameChar);
        }

    }
}
