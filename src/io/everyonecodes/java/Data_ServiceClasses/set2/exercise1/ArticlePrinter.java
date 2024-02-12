package io.everyonecodes.java.Data_ServiceClasses.set2.exercise1;

public class ArticlePrinter {

    public ArticlePrinter() {
    }

    public void printArticle(Article article) {
        System.out.println("Title: " + article.getTitle() + "\nText: " + article.getText());
    }
}
