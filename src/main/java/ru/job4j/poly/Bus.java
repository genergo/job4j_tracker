package ru.job4j.poly;

    public class Bus implements Transport {

    @Override
    public void drive() {
    }

    @Override
    public void passengers(int passengers) {
        System.out.println("введите количество пассажиров : " + passengers);
    }

    @Override
    public int refill(int ful) {
        return ful * 40;
    }
}
