package ru.job4j.inheritance;

   public class JSONReport extends TextReport {
        public String generate(String name, String body) {
            return  "{" + System.lineSeparator()
            + "\t\"name\" : " + "\"" + name + "\"," + System.lineSeparator()
                    + "\t\"body\" : " + "\"" + body + "\"" + System.lineSeparator() + "}";
        }

    public static void main(String[] args) {
        JSONReport report2 = new JSONReport();
        String text2 = report2.generate("Report's name ", "Report's body");
        System.out.println(text2);
    }
}

