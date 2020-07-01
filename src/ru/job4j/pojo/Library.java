package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("Дозор", 200);
        Book book2 = new Book("Обзор", 300);
        Book book3 = new Book("Позор", 100);
        Book book4 = new Book("Clean code", 600);
        Book[] bookshelf = new Book[4];
        bookshelf[0] = book1;
        bookshelf[1] = book2;
        bookshelf[2] = book3;
        bookshelf[3] = book4;
        System.out.println("На полке стоят книги:");
                for (Book i : bookshelf) {
                    System.out.println(i.getName() + ", " + i.getPages() + " pages.");
                }
                for (Book i : bookshelf) {
                    if (i.getName().equals("Clean code")) {
                    System.out.println("Книга " + i.getName() + " найдена.");
                    //break;
                    }
                }
    }
}
