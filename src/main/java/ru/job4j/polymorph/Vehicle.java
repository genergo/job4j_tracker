package ru.job4j.polymorph;

public interface Vehicle extends Fuel {
    int WHELLS = 4;

    void accelerate();

    void brake();

    void steer();

    void changeGear();

    static void getDragCoefficient() {
        System.out.println("Формула расчета коэффициента аэродинамического сопротивления автомобиля");
    }

    default void chargeBattarey() {
        System.out.println("Аккумулятор под капотом. Зарядить.");
    }
}
