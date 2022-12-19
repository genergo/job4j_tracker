package ru.job4j.pojo;

import java.util.Objects;

public class Product {

    private String name;
    private int count;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true; /* 1) проверяем ссылки сравниваемых объектов*/
        if (o == null || getClass() != o.getClass()) return false; /* 2) проверяем аргумент, чтобы не был null*/
        Product product = (Product) o; /* 3)проверяем типы классов*/
        return count == product.count && Objects.equals(name, product.name); /* 4)проверяем поля, если равны,
        то и объекты равны*/
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, count);
    }

    public Product(String name, int count) {
        this.name = name;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
