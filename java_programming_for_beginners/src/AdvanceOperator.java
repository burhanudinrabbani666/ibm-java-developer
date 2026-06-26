package java_programming_for_beginners.src;

public class AdvanceOperator {
    public static void main(String[] args) {

        byte a = 10;
        a += 5;
        System.err.println("New Value of a: " + a);

        a *= 2;
        System.err.println("After multiplication, new value of a: " + a);

        // Unary operator
        /**
         * ++
         * --
         */

        // Teranry operators
        byte ao = 10;
        byte bo = 20;

        byte max = (ao > bo) ? ao : bo;
        System.out.println("Maximum value is: " + max);

    }
}
