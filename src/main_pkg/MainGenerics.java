package main_pkg;

import behaviors_pkg.Operations;

public class MainGenerics {
    public static void main(String[] args) {

        Operations op = new Operations();

        System.out.println("Product: " + op.product(1, 2));
        System.out.println("Max Value: " + op.maxValue(op));
        System.out.println("Min Value: " + op.minValue(op));
        System.out.println("Sum: " + op.sum(3, 4));
        System.out.println("Factorial: " + op.factorial(0));
        System.out.println(op.prime());
    }
}
