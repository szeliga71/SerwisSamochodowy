package com.GUI;

import java.util.Random;

public class CarRepair implements Runnable{
    Item car;
    CarServiceSpot cs;

    public CarRepair(CarServiceSpot cs,Item car){
    this.cs=cs;
    this.car=car;


    }
    public void run() {

        cs.lift[0]=car;
        Random r=new Random();
        int day=r.nextInt(4)+1;
        System.out.println(day);




        while (day > 0) {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException exc) {
                System.out.println(" 5 sekundowa przerwa w watku");
                return;
            }
            day--;
            System.out.println(day + " " + "dzien");

        }
        cs.lift[0]=null;

        System.out.println(" koniec "+" "+ cs+" "+ car);
    }
}
