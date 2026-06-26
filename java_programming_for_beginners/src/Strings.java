package java_programming_for_beginners.src;

public class Strings {
    public static void main(String[] args) {

        String name = "burhanudin rabbani";
        System.out.println("Name at index 0: " + name.charAt(0));

        int nameLength = name.length();
        System.out.println("name length: " + nameLength);

        String marga = "marasabesi";
        System.out.println(name.concat(marga));

        System.out.println(name.equals(marga)); // case sensitive
        System.out.println("substring: " + name.substring(5, nameLength));
        System.out.println(name.split(" "));
        System.out.println(name.toUpperCase());

    }
}
