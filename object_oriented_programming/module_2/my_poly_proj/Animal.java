package object_oriented_programming.module_2.my_poly_proj;

public class Animal {

    private String name;
    private String food;

    public Animal(String name) {
        this.name = name;
    }

    public String sound() {
        return null;
    }

    public String toString() {
        return this.name.concat(" says ");
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getFood() {
        return this.food;
    }

}
