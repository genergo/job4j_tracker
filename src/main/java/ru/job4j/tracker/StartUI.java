package ru.job4j.tracker;

import java.time.format.DateTimeFormatter;

public class StartUI {
    public static void main(String[] args) {
        Item one = new Item();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");
        System.out.println(one.getCreated().format(formatter));
        Item item = new Item(21, " Vasya ");
                System.out.println("Item : "
               + item.getId() + " "
                + item.getName() + " "
                + item.getCreated().format(formatter));
        }
}
