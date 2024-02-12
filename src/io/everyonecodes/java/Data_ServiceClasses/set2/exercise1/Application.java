package io.everyonecodes.java.Data_ServiceClasses.set2.exercise1;

public class Application {

    public static void main(String[] args) {
        Article articleAboutSomething = new Article("Article about something", "This is a text about some topic.");
        ArticlePrinter articlePrinter = new ArticlePrinter();
        articlePrinter.printArticle(articleAboutSomething);
    }
}
