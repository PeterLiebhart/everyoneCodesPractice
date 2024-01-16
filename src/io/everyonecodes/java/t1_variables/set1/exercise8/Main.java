package io.everyonecodes.java.t1_variables.set1.exercise8;

public class Main {
    public static void main(String[] args) {
        double a = 1.000001;
        double b = 0.000001;
        double c = 1.0;
        double substracted = a - b;
        System.out.println("The third variable: " + c + " The result of a - b:" + substracted);
        //a - b equals 0.9999999999999999. This happens because of a rounding error, since the numbers can't be accurately represented in a floating point format.
    }
}
