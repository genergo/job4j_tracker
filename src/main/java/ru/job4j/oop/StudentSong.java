package ru.job4j.oop;

public class StudentSong {
    public void music(String lyrics) {
        System.out.println("I can sing a song : " + lyrics);
    }

    public static void main(String[] args) {
        StudentSong petya = new StudentSong();
        String song = "I believe I can fly";
        petya.music(song);
    }
}
