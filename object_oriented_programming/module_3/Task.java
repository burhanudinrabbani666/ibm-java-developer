package object_oriented_programming.module_3;

public class Task {

    public static Integer HIGH = 3;
    public static Integer MEDIUM = 2;
    public static Integer LOW = 1;

    public static String COMPLETE = "COMPLETE";
    public static String IN_PROGRESS = "IN-PROGRESS";
    public static String NEW = "NEW";

    private String name;
    private String description;
    private Integer priority;
    private String status = NEW;

    public Task(String name, String description, Integer priority) {
        this.name = name;
        this.description = description;
        this.priority = priority;
    }

    public Task(String name, Integer priority) {
        this.name = name;
        this.priority = priority;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getDescription() {
        return this.description;
    }

    public String getStatus() {
        return this.status;
    }

    public int getPriority() {
        return this.priority;
    }

    public String toString() {
        return name.concat("\n").concat(description).concat("\n").concat((priority + "")).concat("\n")
                .concat(status);
    }

}
