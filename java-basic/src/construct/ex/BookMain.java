package construct.ex;

public class BookMain {
    public static void main(String[] args) {

        Book book1 = new Book();
        book1.displayInfo();

        Book book2 = new Book("Hello java","Kim");
        book2.displayInfo();

        Book book3 = new Book("Dec","Lee",159);
        book3.displayInfo();


    }
}
