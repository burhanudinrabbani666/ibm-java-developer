import object_oriented_programming.module_2.Animal.Cat;
import object_oriented_programming.module_2.Animal.Dog;

public class Main {

    public static void main(String[] args) {
        Dog newDog = new Dog();
        newDog.name = "wowok";
        newDog.eat();
        newDog.bark();
        newDog.sound();

        Cat newCat = new Cat();
        newCat.sound();

    }
}