package ru.job4j.oop;

public class DummyDic {
    public String engToRus() {
        String word = "Неизвестное слово";
        return word;
    }

    public static void main(String[] args) {
        DummyDic peppy = new DummyDic();
        String say = peppy.engToRus();
        System.out.println("Peppy say: " + say);
    }
}
