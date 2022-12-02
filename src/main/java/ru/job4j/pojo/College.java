package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Ivanov - ");
        student.setGroup(2);
        student.setDateReceipt("12/12/2005");

        System.out.println(student.getName() + " группa № " + student.getGroup() + " : " + student.getDateReceipt());

    }
}
