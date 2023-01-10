package ru.job4j.polymorph;

public interface Func2 {
    default double func(double x, double y) {
        return x * x - y + 5;
    }

    default void funcMessange() {
        System.out.println("Сообщение от Func2");
    }
}
