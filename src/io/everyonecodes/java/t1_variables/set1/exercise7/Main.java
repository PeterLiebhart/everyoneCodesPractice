package io.everyonecodes.java.t1_variables.set1.exercise7;

import java.math.BigInteger;

public class Main {
    public static void main (String[] args) {
        int first = 10;
        int second = 1000;
        int third = 1000000;
        //int fourth = 10000000000; this number is too big to store in an integer like this. There is a limit because bigger numbers need more bits, and we don't have unlimited amounts of those.
        int maxInt = Integer.MAX_VALUE;
        //here the maximum value an integer can have is stored in the "maxInt" variable.
        int maxIntPlusOne = maxInt + 1;
        System.out.println(maxIntPlusOne);
        //the result is not correct mathematically. Since Java cannot store the more than maxInt, it just jumps to the other end of the possible spectrum, which is just -maxInt
    }
}
