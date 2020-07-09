package ru.job4j.io;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean run = true;
        int count = 11;
        int round = 1;
        System.out.println("Игра 11 спичек, выигрывает последний забравший спички." + System.lineSeparator()
                + "Можно брать не больше трех спичек!" + System.lineSeparator() + "Начали!");
        while (run) {
            int gamer = round % 2 != 0  ? 1 : 2;
            String plural = count > 1 ? "спичек" : "спичка";
            System.out.println("на столе " + count + " " + plural + ", игрок " + gamer + ", сколько забираете?");
            int drop = Integer.valueOf(input.nextLine());
            if (count < drop) {
                System.out.println("Вы не можете так сделать, нет такого количества спичек.");
                round--;
            } else if (drop > 3) {
                System.out.println("Нельзя брать больше трех!");
                round--;
            } else {
                count -= drop;
            }
            if (count == 0) {
                System.out.println("Поздравляю! Игрок " + gamer + ". Вы выиграли!");
                run = false;
            }
            round++;
        }

    }
}