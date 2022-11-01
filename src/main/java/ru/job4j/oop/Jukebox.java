package ru.job4j.oop;

public class Jukebox {
    public static void music(int position) {
        if (position == 1) {
            System.out.println("Пусть бегут неуклюже");
        } else if (position == 2) {
            System.out.println("Спокойной ночи");
        } else {
            System.out.println("Песня не найдена");
        }
    }

    public static void main1(int position) {
        String song = position == 1 ? "Пусть бегут" : (position == 2 ? "Спокойной ночи" : "Песня не найдена");
        System.out.println(song);
    }

      public static void main(String[] args) {
      Jukebox.music(2);
      Jukebox.main1(0);
    }
}

