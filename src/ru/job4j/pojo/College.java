package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFio("Ivan Ivanovitch Ivanov");
        student.setGroup("HH-034");
        student.setIntro(new Date());


        System.out.println(student.getFio() + " are student in group - " + student.getGroup()
                + " : " + student.getIntro());
    }
}

