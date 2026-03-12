package main;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(3,5);
        Fraction f2 = new Fraction(49,12);
        Fraction f3 = new Fraction(3,2);
        Fraction f4 = new Fraction(1,3);

        System.out.println(MathUtils.sumAll(2,f1,2.3));
        System.out.println(MathUtils.sumAll(3.6,f2,3,f3));
        System.out.println(MathUtils.sumAll(f4,1));
    }
}