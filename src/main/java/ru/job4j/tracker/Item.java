package ru.job4j.tracker;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Item {
    private int id;
    private String name;
    private final LocalDateTime created = LocalDateTime.now();

    public Item() {
    }

    public Item(String name) {
        this.name = name;
    }

    public LocalDateTime getCreated() {
        return created;
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

            Item four = new Item();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");
            System.out.println(four.getCreated().format(formatter));
        }
    }
