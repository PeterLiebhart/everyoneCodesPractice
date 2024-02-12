package io.everyonecodes.java.Data_ServiceClasses.set2.exercise2;

public class Application {
    public static void main(String[] args) {
        Editor editor = new Editor();
        Magazine programmingMagazine = editor.writeMagazine();
        Printer printer = new Printer();
        printer.printMagazine(programmingMagazine);
    }
}
