package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item[] findAll() {
        return Arrays.copyOf(items, size);
    }

    public Item[] findByName(String key) {
        Item[] rsl = new Item[items.length];
        int size = 0;
        for (int i = 0; i < items.length; i++) {
            Item name = items[i];
            if (name != null && name.getName() != null && name.getName().equals(key)) {
                rsl[size] = name;
                size++;
            }
        }
        return Arrays.copyOf(rsl, size);
    }

    public Item findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items[index] : null;
    }

    public boolean replace(int id, Item item) {
        int index = indexOf(id);
        boolean rsl = index != -1;
        if (rsl) {
            item.setId(id);
            items[index] = item;
            rsl = true;
        }
        return rsl;
    }

    public boolean delete(int id) {
        int index = indexOf(id);
        boolean rsl = index != -1;
        if (rsl) {
            items[index] = null;
            System.arraycopy(items, index + 1, items, index, size - index - 1);
            items[size -  1] = null;
            size--;
            rsl = true;
        }
    return rsl;
}

    private int indexOf(int id) {
        int rsl = -1;
        for (int i = 0; i < size; i++) {
            if (items[i].getId() == id) {
                rsl = i;
                break;
            }
        }
        return rsl;
    }
}

