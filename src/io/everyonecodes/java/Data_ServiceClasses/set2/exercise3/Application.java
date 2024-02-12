package io.everyonecodes.java.Data_ServiceClasses.set2.exercise3;

public class Application {

    public static void main(String[] args) {

        HikerGatherer gatherer = new HikerGatherer();

        HikeDisplayer displayer = new HikeDisplayer();

        Hike hike = new Hike("12.02.2006", gatherer.gather());

        displayer.display(hike);
    }
}
