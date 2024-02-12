package io.everyonecodes.java.Data_ServiceClasses.set2.exercise2;

import io.everyonecodes.java.Data_ServiceClasses.set2.exercise1.Article;
import io.everyonecodes.java.Data_ServiceClasses.set2.exercise1.ArticlePrinter;

public class Printer {
    public void printMagazine(Magazine magazine) {
        ArticlePrinter articlePrinter = new ArticlePrinter();
        System.out.println("Title: " + magazine.getTitle() + "\nArt");
        for (Article article : magazine.getListOfArticles()) {
            articlePrinter.printArticle(article);
        }
    }
}


