package object_oriented_programming.module_3;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

    public static void main(String[] args) {

        Queue<String> customerQueue = new LinkedList<>();

        customerQueue.offer("Customer 1");
        customerQueue.offer("Customer 2");
        customerQueue.offer("Customer 3");

        System.out.println("Current Customer: " + customerQueue);

        // Serving the first customer in the queue
        String servedCustomer = customerQueue.poll();
        System.out.println("Serving: " + servedCustomer);

        System.out.println("Current Customer: " + customerQueue);

    }

}
