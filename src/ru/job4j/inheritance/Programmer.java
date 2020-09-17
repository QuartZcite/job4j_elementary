package ru.job4j.inheritance;

public class Programmer extends Engineer {
    private String lang;
    private String programm;

    public String getLang() {
        return lang;
    }

    public String makeProgramm() {
        return programm;
    }
}
