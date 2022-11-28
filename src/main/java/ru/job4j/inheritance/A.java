package ru.job4j.inheritance;

 public class A {
 int i;
}

class B extends A {
    int i;

    B(int a, int b) {
        super.i = a;
        i = b;
    }

    void show() {
        System.out.println("i  в суперклассе: " + super.i);
        System.out.println("i в подклассе: " + i);
    }

    public static void main(String[] args) {
        B subOb = new B(1, 2);
        subOb.show();
    }
}

