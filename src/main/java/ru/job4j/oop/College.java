package ru.job4j.oop;

public class College {
    public static void main(String[] args) {

        FreshMan freshMan = new FreshMan();
        Student student = freshMan;
        Object obj = freshMan;

        int one = 10;
        short two  = 20;
        one = two;

        two = (short) one;
    }
}


