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

    public void decreaseFood (int n) {
       food -= n;
       if (food < 0) {
           food += n;
           System.out.println("Недостаточно еды в тарелке" );
       }
    }

    public  void info() {
       System.out.println("plate: " + food);
   }
}
