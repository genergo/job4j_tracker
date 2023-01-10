package ru.job4j.poly;

public class Buss implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " - двигается по скоростным трассам ");
    }

    @Override
    public void fuel() {
        System.out.println(getClass().getSimpleName() + " - заправляют дизтопливом ");
    }
}
