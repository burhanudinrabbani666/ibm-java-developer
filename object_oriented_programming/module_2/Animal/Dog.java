package object_oriented_programming.module_2.Animal;

// Subclass
public class Dog extends Animal {

    public void bark() {
        System.out.println(this.name + " bark!!");
    }

    @Override
    public void sound() {
        System.out.println("Dogs Bark");
    }
}
