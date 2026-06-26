package java_programming_for_beginners.src.test;

public class Users {

    public String name;

    public Users(String name) {
        this.name = name;
    }

    public void greeting() {
        System.out.println("Hello, " + this.name);
    }

}
