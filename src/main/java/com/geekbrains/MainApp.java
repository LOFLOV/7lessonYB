package com.geekbrains;

public class MainApp {
    public static void main(String[] args) {
        Plate plate1 = new Plate(105);
        plate1.info();



        Cat[] cats = new Cat[5];
        cats[0] = new Cat("jacob", 20);
        cats[1] = new Cat("alex", 100);
        cats[2] = new Cat("dima", 5);
        cats[3] = new Cat("oleg", 15);
        cats[4] = new Cat("ola", 50);

        for (Cat cat : cats) {
            cat.eat(plate1);
            cat.info();
        }
        plate1.info();
        plate1.addFood(100);

    }
}
