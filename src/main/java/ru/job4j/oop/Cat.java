package ru.job4j.oop;

public class Cat {

    private String food; /*  создали поле класса Cat, которое называется food */

    private  String name;

    public void show() {
        System.out.println(this.name + " eat " + this.food);
         /*выводит в консоль содержимое поля food*/
            /* this. Это слово указывает, что нужно вывести содержимое поля.*/
    }

    public void eat(String meat) {
        this.food = meat;
    }

    public void giveNick(String nick) {
        this.name = nick;
    }

    public static void main(String[] args) {
        System.out.println("There are gav's food.");
        Cat gav = new Cat();
        gav.giveNick("Nick");
        gav.eat("kotleta");
        gav.show();
        System.out.println("There are black's food.");
        Cat black = new Cat();
        black.giveNick("Reks");
        black.eat("fish");
        black.show();
    }
}

