package ru.job4j.inheritance;

public class ReportUsage {
    public static void main(String[] args) {
        TextReport report = new TextReport();
        String text = report.generate("Report's name", "Report's body");
        System.out.println(text);

        System.out.println();

        HtmlReport report1 = new HtmlReport();
        String text1 = report1.generate("Report's name ", "Report's body");
        System.out.println(text1);

        System.out.println();

    }
}

