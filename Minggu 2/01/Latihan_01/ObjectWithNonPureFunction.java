package Latihan1;

import static Latihan1.ObjectWithPureFunction.sum;

public class ObjectWithNonPureFunction {

    static int value = 0;

    static int add(int nextValue) {
        value += nextValue;
        return value;
    }
    public static void main(String[] args) {
        System.out.println(add(1));
    }
}
