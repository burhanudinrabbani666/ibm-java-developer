package object_oriented_programming.module_1;

public class Employee implements Cloneable {

    private String name;
    private float age;
    private double salary;

    public Employee() {
        this.name = "Unknown";
        this.age = 18;
        this.salary = 0;
    }

    public Employee(String name, float age, double salary) {
        this.setName(name);
        this.age = age;
        this.salary = salary;
    }

    // VALIDATION
    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Error: Name cannot be null or empty. Setting to Unknown");
            this.name = "Unknown";
        }
    }

    public void setAge(float age) {
        if (age >= 18 && age <= 65) {
            this.age = age;
        } else {
            System.out.println("Error: Age cannot greater than 65 and less than 18. Setting default to 18");
            this.age = 18;
        }
    }

    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Error: Salary cannot be negative. Setting default to 0");
            this.salary = 0;
        }
    }

    public double calculateAnnualSalary() {
        return this.salary * 12;
    }

    public void giveRaise(double percentage) {
        if (percentage > 0) {
            double raiseAmount = this.salary * (percentage / 100);
            this.salary += raiseAmount;
            System.out.println(this.name + " received a raise of " + percentage + "%");
        } else {
            System.out.println("Raise percentage must be positive");
        }
    }

    public void displayDetails() {
        System.out.println("Employee Details:");
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Monthly Salary: $" + String.format("%.2f", this.salary));
        System.out.println("Annual Salary: $" + String.format("%.2f", calculateAnnualSalary()));
        System.out.println("---------------------------");
    }

    // Step 8: Override the clone method to make Employee objects cloneable
    @Override
    protected Object clone() throws CloneNotSupportedException {
        // Call the superclass clone method to create a shallow copy
        return super.clone();
    }

}
