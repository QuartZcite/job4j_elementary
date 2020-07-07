package ru.job4j.io;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean run = true;
        int count = 11;
        System.out.println("Игра 11 спичек, выигрывает последний забравший спички." + System.lineSeparator()
                + "Можно брать не больше трех спичек!" + System.lineSeparator() + "Начали!");
        while (run) {
            String plural = count > 1 ? "спичек" : "спичка";
            System.out.println("на столе " + count + " " + plural + ", сколько забираете?");
            int drop = Integer.valueOf(input.nextLine());
            if (count < drop) {
                System.out.println("Вы не можете так сделать, нет такого количества спичек.");
            } else if (drop > 3) {
                System.out.println("Нельзя брать больше трех!");
            } else {
                count -= drop;
            }
            if (count == 0) {
                System.out.println("Поздравляю! Вы выиграли!");
                run = false;
            }

        }

    }
}