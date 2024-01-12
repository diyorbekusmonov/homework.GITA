package Lesson_14.Homework_2;

public class BookShop {
    Book book;
    private int countIsHaveBooks = 0;
    private String libraryName;
    public int money;
    public BookShop(String libraryName, int money) {
        this.libraryName = libraryName;
        this.money = money;
    }

    public int getCountIsHaveBooks() {
        return countIsHaveBooks;
    }

    BookShop[] addedBooks = new BookShop[]{};

    public int buyBooks(Book book, int countBooks) {
        for (int i = 0; i < countBooks; i++) {

        }
        countIsHaveBooks++;
        return countBooks * book.getBookCost();
    }

    public boolean hasBook() {
        return countIsHaveBooks != 0;
    }

    public boolean hasbook(Book book) {

        return true;
    }
}
