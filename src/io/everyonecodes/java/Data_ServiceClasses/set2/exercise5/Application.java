package io.everyonecodes.java.Data_ServiceClasses.set2.exercise5;

public class Application {
    //Define the Application class that contains the main method which creates two shoe customers with shoe sizes 38 and 42 and finds shoes for them.
    public static void main(String[] args) {
        ShoeCustomer peter = new ShoeCustomer(40);
        ShoeCustomer sarah = new ShoeCustomer(38);
        ShopAssistant.findShoeForCustomer(peter);
        ShopAssistant.findShoeForCustomer(sarah);
    }
}
