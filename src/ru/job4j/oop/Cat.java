package ru.job4j.oop;

public class Cat {

    private String food;
    private String name;

    public void show() {
        System.out.println(this.name);
        System.out.println(this.food);
    }

    public void eat(String meat) {
        this.food = "Еда: " + meat;
    }

    public void giveNick(String nick) {
        this.name = "Имя: " + nick;
    }

    public static void main(String[] args) {
        System.out.println("Немного о первом котике.");
        Cat gav = new Cat();
        gav.eat("котлета");
        gav.giveNick("Гав");
        gav.show();
        System.out.println("Немного о втором котике.");
        Cat black = new Cat();
        black.eat("рыба");
        black.giveNick("Черный Кот");
        black.show();
    }
}