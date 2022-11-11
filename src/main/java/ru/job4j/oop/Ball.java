package ru.job4j.oop;

public class Ball {
    public boolean tryRun(boolean condition) {
        if (condition) {
            System.out.println("Был съеден");
        } else {
            System.out.println("Сбеждал");
        }
        return condition;
    }
}