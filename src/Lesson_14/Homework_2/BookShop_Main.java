package Lesson_14.Homework_2;

public class BookShop_Main {
    public static void main(String[] args) {

        Book book = new Book("Otkan kunlar", 40000);
        BookShop bookShop = new BookShop("Azon", 2000000000);
        System.out.println(bookShop.buyBooks(book, 20));
    }
}
