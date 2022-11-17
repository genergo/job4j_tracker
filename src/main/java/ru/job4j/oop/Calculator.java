package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public static int multiply(int a) {
        return x * a;
    }

    public static int minus(int b) {
        return b - x;
    }

    public int divide(int c) {
        return c / x;
    }

     public double add(double first, double second) {
            return first + second;
        }

        public static void main(String[] args) {
        int result = sum(10);
        System.out.println(result);
        Calculator calculator = new Calculator();
        int rsl = Calculator.multiply(5);
        System.out.println(rsl);
        int min = minus(9);
        System.out.println(min);
        int div = calculator.divide(25);
        System.out.println(div);
    }
}
