package io.everyonecodes.java.evaluation.exercise1;

public class Book {

    String ISBN;

    String title;

    String authorName;

    int numberOfPages;

    boolean isBorrowed;

    public Book(String ISBN, String title, String authorName, int numberOfPages, boolean isBorrowed) {
        this.ISBN = ISBN;
        this.title = title;
        this.authorName = authorName;
        this.numberOfPages = numberOfPages;
        this.isBorrowed = isBorrowed;
    }

}
