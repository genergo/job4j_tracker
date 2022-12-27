package ru.job4j.study;

public class One {
    public static void main(String[] args) {
        int number = 10;
        if (number < 0) {
            System.out.println("Это число отрицательное");
        } else {
            System.out.println("Это вне блока if");
        }
    }
}