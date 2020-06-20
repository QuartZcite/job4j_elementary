package ru.job4j.calculator;

public class ArgMethod {

    public static void hello(String name, int age) {
        System.out.println("Hello, " + name + ", " + age + " years old");
    }

    public static void main(String[] args) {
        String name = "Petr Arsentev";
        int age = 34;
        ArgMethod.hello(name, age);
    }
}
