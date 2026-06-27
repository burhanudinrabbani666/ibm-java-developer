// import object_oriented_programming.module_1.Car;
// import object_oriented_programming.module_1.Book;

import object_oriented_programming.module_1.Person;

public class Main {

    public static void main(String[] args) {

        Person newPerson = new Person("burhanudin rabbani", 23);

        System.out.println("Name: " + newPerson.getName());
        System.out.println("Age: " + newPerson.getAge());

        newPerson.setName("dragon");
        newPerson.setAge(1000);

        System.out.println("Name: " + newPerson.getName());
        System.out.println("Age: " + newPerson.getAge());

    }

}
