public class Book {
    // instance variables
    private String title; // title of book
    private String author; // author of book
    private int year; // year of publication

    // constructor creates a new book
    public Book(String title, String author, int year) {
        if (year < 0) throw new RuntimeException("year of publication negative");
        this.title = title;
        this.author = author;
        this.year = year;
    }
}
