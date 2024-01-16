package io.everyonecodes.java.t1_variables.set1.exercise10;

public class Main {
    public static void main (String[] args) {
        int pages = 245;
        int days = 30;
        int pagesPerDay = pages / days;
        //the issue is that we are using integers instead of doubles here. When you divide 2 ints, the result will get cut off after the comma, so it is not accurate.
        //to solve this we could use double instead of int
        System.out.println(pagesPerDay);
    }
}
