package ru.job4j.inheritance;

public class HideExampleMain {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal tac = new Tac();
        animal.instanceInvoke();
        tac.instanceInvoke();
        Animal.staticInvoke();
        Tac.staticInvoke();
    }
}
