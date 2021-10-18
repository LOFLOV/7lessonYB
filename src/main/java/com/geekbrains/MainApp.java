package com.geekbrains;

public class MainApp {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Barsik", 105, false);
        Cat cat2 = new Cat("Alki", 55, false);
        Plate plate1 = new Plate(105);
        Plate plate2 = new Plate(50);
        plate1.info();
        cat1.eat(plate1);

        plate2.info();
        cat2.eat(plate2);
        cat1.info();

    }
}
