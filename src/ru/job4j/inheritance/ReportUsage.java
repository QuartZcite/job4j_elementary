package ru.job4j.inheritance;

public class ReportUsage {
    public static void main(String[] args) {
        TextReport report = new TextReport();
        String text = report.generate("Report's name", "Report's body");
        System.out.println(text);

        HtmlReport reportH = new HtmlReport();
        text = reportH.generate("Report's name", "Report's body");
        System.out.println(text);

        JSONReport reportJ = new JSONReport();
        text = reportJ.generate("name", "body");
        System.out.println(text);
    }
}