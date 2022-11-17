package ru.job4j.oop;

public class Jar {

    private int value;

    public Jar(int size) {
        this.value = size;
    }

    public void pour(Jar another, int litr) {
        if (another.value >= litr) {
            this.value = this.value + litr;
            another.value = another.value - litr;
        }
    }

    public static void main(String[] args) {
        Jar first = new Jar(10);
        Jar second = new Jar(5);
        System.out.println("first: " + first.value + ". second: " + second.value);
        first.pour(second, 1);
        System.out.println("first: " + first.value + ". second: " + second.value);
    }
}
