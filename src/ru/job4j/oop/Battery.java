package ru.job4j.oop;

public class Battery {
    private int load;

    public Battery(int value) {
        this.load = value;
    }

    public void exchange(Battery another) {
        another.load = another.load + this.load;
        this.load = 0;
     }

    public static void main(String[] args) {
        Battery charged = new Battery(100);
        Battery uncharged = new Battery(20);
        System.out.println("Заряд батареи 1: " + charged.load + " mA. " + "Заряд батареи 2: " + uncharged.load + " mA.");
        charged.exchange(uncharged);
        System.out.println("Заряд батареи 1: " + charged.load + " mA. " + "Заряд батареи 2: " + uncharged.load + " mA.");



    }
}