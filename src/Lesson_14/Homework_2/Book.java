package Lesson_14.Homework_2;

public class Book {
    private String bookName;
    private int bookCost;

    public Book(String bookName, int bookCost) {
        this.bookName = bookName;
        this.bookCost = bookCost;
    }

    public String getBookName() {
        return bookName;
    }

    public int getBookCost() {
        return bookCost;
    }
}
