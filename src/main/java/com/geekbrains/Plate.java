package com.geekbrains;

public class Plate {
    private int food;

    public Plate(int food) {
        if (food >= 0) {
            this.food = food;
        } else {
            System.out.println("Введено открицательное кол-во еды");
        }
    }

    public boolean decreaseFood(int n) {
        if (food - n > 0) {
            food -= n;
            return true;
        }
        return false;
    }

    public void info() {
        System.out.println("plate: " + food + " кол-во еды в тарелке");
    }
    public void addFood(int n) {
        food += n;
        System.out.println(n + " едениц еды добавленно в тарелку");
    }
}
