package ru.job4j.oop;

public class DummyDic {
    public String engToRus(String eng) {
        String word = "Неизвестное слово - " + eng;
        return word;
    }

    public static void main(String[] args) {
        DummyDic peppy = new DummyDic();
        String eng = peppy.engToRus("teach");
        System.out.println(eng);
    }
}
