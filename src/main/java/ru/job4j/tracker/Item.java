package ru.job4j.tracker;

public class Item {
    private int id;
    private String name;

    public Item() {
    }

    public Item(String name) {
        this.name = name;
    }

    public Item(int id, String name) {
        this.id = id;
        this.name = name;
}

    public void printInfo() {
        System.out.println("id " + id);
        System.out.println("Name " + name);
    }

    public static void main(String[] args) {
    Item one = new Item();
    one.printInfo();

    Item two = new Item("Irt");
    two.printInfo();

    Item three = new Item(10, "Artak");
    three.printInfo();
        }
}