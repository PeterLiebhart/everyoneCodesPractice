package io.everyonecodes.java.Data_ServiceClasses.set2.exercise2;

import io.everyonecodes.java.Data_ServiceClasses.set2.exercise1.Article;

import java.util.ArrayList;
import java.util.List;

public class Editor {

    public Magazine writeMagazine() {
        Article theDangersOfProgramming = new Article("The Dangers Of Programming", "Programming is dangerous");
        Article theJoysOfProgramming = new Article("The Joys of Programming", "Programming is joyful");
        Article howToProgram = new Article("How To Program", "print(Hello World!)");
        List<Article> articleList = new ArrayList<>(List.of(theJoysOfProgramming, theDangersOfProgramming, howToProgram));
        return new Magazine("Programming", articleList);
    }
}
