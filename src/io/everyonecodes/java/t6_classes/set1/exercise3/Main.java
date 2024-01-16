package io.everyonecodes.java.t6_classes.set1.exercise3;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Person peter = new Person("Peter", List.of("Asdren", "Ali"));
        Person natascha = new Person("Natascha", List.of("Ali"));
        peter.friends.add("Natascha");
    }
}
