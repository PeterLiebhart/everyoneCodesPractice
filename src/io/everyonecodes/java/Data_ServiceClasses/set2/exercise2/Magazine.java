package io.everyonecodes.java.Data_ServiceClasses.set2.exercise2;
import io.everyonecodes.java.Data_ServiceClasses.set2.exercise1.Article;

import java.util.List;

public class Magazine {

    private String title;
    private List<Article> listOfArticles;

    public Magazine(String title, List<Article> listOfArticles) {
        this.title = title;
        this.listOfArticles = listOfArticles;
    }

    public String getTitle() {
        return title;
    }

    public List<Article> getListOfArticles() {
        return listOfArticles;
    }
}
