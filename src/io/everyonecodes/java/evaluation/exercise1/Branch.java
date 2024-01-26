package io.everyonecodes.java.evaluation.exercise1;

import java.util.List;

public class Branch {

    String streetName;
    int yearOpened;

    List<Book> books;

    List<Magazine> magazines;

    public Branch(String streetName, int yearOpened, List<Book> books, List<Magazine> magazines) {
        this.streetName = streetName;
        this.yearOpened = yearOpened;
        this.books = books;
        this.magazines = magazines;
    }

}
