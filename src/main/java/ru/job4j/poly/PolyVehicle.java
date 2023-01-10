package ru.job4j.poly;

public class PolyVehicle {
    public static void main(String[] args) {
        Vehicle airplane = new Airplane();
        Vehicle buss = new Buss();
        Vehicle train = new Train();

        Vehicle[] vehicles = new Vehicle[]{airplane, buss, train};
        for (Vehicle a : vehicles) {
            a.move();
            a.fuel();
        }
    }
}
