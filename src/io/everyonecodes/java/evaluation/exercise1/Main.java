package io.everyonecodes.java.evaluation.exercise1;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static List<Book> getShortAndAvailableBooks(Branch branch) {
        List<Book> shortAndAvailableBooks = new ArrayList(List.of());
        for (Book book : branch.books) {
            if (book.numberOfPages < 200 && !book.isBorrowed) {
                shortAndAvailableBooks.add(book);
            }
        }
        return shortAndAvailableBooks;
    }

    public static void main(String[] args) {
        Book asianCooking = new Book("123-321-432-234", "Asian Cooking", "Chang Jusef", 100, false);
        Book europeanCooking = new Book("183-321-442-516", "European Cooking", "Frank Dough", 199, false);
        Magazine cookingWhileTraveling = new Magazine("Cooking While Traveling", 23614, true);
        Magazine cookingWhileWorking = new Magazine("Cooking While Working", 23098, false);
        Branch cookingBranch = new Branch("Muthgasse", 1989, List.of(asianCooking, europeanCooking), List.of(cookingWhileWorking, cookingWhileTraveling));

        for (Book book : getShortAndAvailableBooks(cookingBranch)) {
            System.out.println(book.title);
        }
    }
}
