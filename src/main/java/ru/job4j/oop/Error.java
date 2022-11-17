package ru.job4j.oop;

public class Error {

    private  boolean active;
    private int status;
    private String message;
    private char balance;

    public Error() {
    }

    public Error(boolean active, int status, String message, char balance) {
        this.active = active;
        this.status = status;
        this.message = message;
        this.balance = balance;
    }

       public static void main(String[] args) {
        /*Error error = new Error(); */
        Error error = new Error(true, 5000, "Привет", '#');
        error.info();

    }

    public void info() {
        System.out.println("Active: " + active);
        System.out.println("Status: " + status);
        System.out.println("Messange: " + message);
        System.out.println("Balance: " + balance);
    }
}
