
// import object_oriented_programming.module_1.Car;
import object_oriented_programming.module_1.Book;
// import object_oriented_programming.module_1.Person;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {

        Book book1 = new Book("Dari penjara ke penjara", "Tan malaka", 90000);

        Book book2 = new Book();
        book2.setAuthor("Jane austen");
        book2.setPrice(50000);
        book2.setTitle("Pride and Prejudice");

        System.out.println("Book no.1");
        System.out.println(book1);
        System.out.println("Book no.2");
        System.out.println(book2);

        Book book3 = (Book) (book1.clone());
    }

}
