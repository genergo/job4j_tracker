package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book cleanCode = new Book("Clean code", 23);
        Book hi = new Book("Hi", 12);
        Book night = new Book("Night", 22);
        Book ni = new Book("Ni", 29);
        Book[] books = new Book[4];
        books[0] = cleanCode;
        books[1] = hi;
        books[2] = night;
        books[3] = ni;
        for (int i = 0; i < books.length; i++) {
            Book pr = books[i];
            System.out.println(pr.getName() + " - " + pr.getPages());
        }

         System.out.println(" ");
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;
        for (int i = 0; i < books.length; i++) {
            Book pr = books[i];
            System.out.println(pr.getName() + " - " + pr.getPages());
        }

        System.out.println("Найди книгу");
           for (int i = 0; i < books.length; i++) {
               if ("Clean code".equals(books[i].getName())) {
                   Book pr = books[i];
               System.out.println("Result = " + pr.getName() + System.lineSeparator() + pr.getPages());
           }
        }
    }
}

