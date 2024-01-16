package io.everyonecodes.java.t6_classes.set2.exercise3;

import java.util.List;

public class Main {

    public static List<Shape> getTrafficSignsFromHomeToWork(){
        return List.of(
                new Shape("octagon", "red"),
                new Shape("triangle", "red"),
                new Shape("circle", "white"),
                new Shape("circle", "blue"),
                new Shape("octagon", "red")
        );
    }

    public static int countShapes(List<Shape> shapes, Shape shape) {
        int total = 0;
        for (Shape shapeInstance : shapes) {
            if (shapeInstance.name.equals(shape.name) && shapeInstance.color.equals(shape.color)) {
                total++;
            }
        }
        return total;
    }

    public static int countStops(List<Shape> shapes) {
        int total = 0;
        for (Shape shape : shapes) {
            if (shape.color.equals("red") && shape.name.equals("octagon")) {
                total++;
            }
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println(countShapes(getTrafficSignsFromHomeToWork(), new Shape("octagon", "red")));
        System.out.println(countStops(getTrafficSignsFromHomeToWork()));
    }
}
