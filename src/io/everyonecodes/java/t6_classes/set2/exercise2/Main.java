package io.everyonecodes.java.t6_classes.set2.exercise2;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static List<Dish> listMenu(Menu menu) {
        return menu.dishes;
    }

    public static void main(String[] args) {
        List<Dish> dishes = new ArrayList(List.of());
        Dish spaghetti = new Dish("Spaghetti", 10.0);
        Dish pizza = new Dish("Pizza", 8.0);
        Dish salad = new Dish("Salad", 5.0);
        dishes.add(spaghetti);
        dishes.add(pizza);
        dishes.add(salad);
        Menu italiano = new Menu("Italiano", dishes);
        List<Dish> menuDishes = listMenu(italiano);
        for (Dish dish : menuDishes) {
            System.out.println(dish.name + " " + dish.price);
        }
        System.out.println(italiano.dishes.toString());
    }
}
