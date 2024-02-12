package io.everyonecodes.java.Data_ServiceClasses.set2.exercise5;

public class ShoeCustomer {

    private int shoeSizeOfCustomer;

    public ShoeCustomer(int shoeSizeOfCustomer) {
        this.shoeSizeOfCustomer = shoeSizeOfCustomer;
    }

    public boolean tryShoe(Shoe shoe) {
        if (shoe.getShoeSize() == shoeSizeOfCustomer) {
            return true;
        }
        return false;
    }

    public int getShoeSizeOfCustomer() {
        return shoeSizeOfCustomer;
    }
}
