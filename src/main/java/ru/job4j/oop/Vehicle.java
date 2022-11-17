package ru.job4j.oop;

public class Vehicle {
    int passenger;
    int fuelcap;
    int mpg;
}

    class VehiceDemo {
        public static void main(String[] args) {
            Vehicle minivan = new Vehicle();
            int range;
            minivan.passenger = 7;
            minivan.fuelcap = 16;
            minivan.mpg = 21;
            range = minivan.fuelcap * minivan.mpg;
            System.out.println("Минифургон может перевести "
                    + minivan.passenger + "пассажиров на расстояние " + "миль");
        }
    }



