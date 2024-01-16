package io.everyonecodes.java.t6_classes.reflection.exercise2;

import java.util.List;

public class Main {

    public static List<Shape> getPaintingShapes() {
        return List.of(
                new Shape("circle", "blue"),
                new Shape("circle", "red"),
                new Shape("triangle", "green"),
                new Shape("circle", "blue"),
                new Shape("rectangle", "yellow"),
                new Shape("circle", "blue"),
                new Shape("square", "red"),
                new Shape("rectangle", "blue"),
                new Shape("square", "red"),
                new Shape("triangle", "green"),
                new Shape("circle", "blue"),
                new Shape("rectangle", "yellow"),
                new Shape("triangle", "green"),
                new Shape("square", "red")
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

    public static int countFavouriteShapes(List<Shape> shapes) {
        int total = 0;
        for (Shape shape : shapes) {
            boolean isRedSquare = shape.color.equals("red") && shape.name.equals("square");
            boolean isGreenTriangle = shape.color.equals("green") && shape.name.equals("triangle");
            if (isRedSquare || isGreenTriangle) {
                total++;
            }
        }
        return total;
    }

    public static void main(String[] args) {

        List<Shape> shapes = getPaintingShapes();

        System.out.println(countFavouriteShapes(shapes));
        System.out.println(countShapes(shapes, new Shape("square", "red")) + countShapes(shapes, new Shape("triangle", "green")));

    }
}
