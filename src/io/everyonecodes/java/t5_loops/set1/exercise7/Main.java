package io.everyonecodes.java.t5_loops.set1.exercise7;

public class Main {

    public static boolean containsQuote(int pageNumber){
//        It so happens that the quote was on page 42! Go figure!
        return pageNumber == 42;
    }


    public static void main(String[] args) {
        for (int i = 0; i <= 200; i++) {
            if (containsQuote(i)) {
                System.out.println("The quote is on page " + i);
                break;
            }
        }
    }
}
