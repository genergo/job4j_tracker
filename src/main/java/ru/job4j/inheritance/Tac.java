package ru.job4j.inheritance;

public class Tac extends Animal {
    @Override
    public void instanceInvoke() {
        System.out.println("Вызов метода экземпляра Tac");
    }

    public static void staticInvoke() {
        System.out.println("Вызов статического метода Tac");
    }
}
