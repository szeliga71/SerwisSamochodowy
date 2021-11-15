package com.GUI;

import java.util.Random;

public class IndependentRepair implements Runnable{

    Item car;
    IndependentCarServiceSpot ics;

    public IndependentRepair(IndependentCarServiceSpot ics,Item car){
        this.ics=ics;
        this.car=car;


    }
    public void run() {

        ics.selflift[0]=car;
        Random r=new Random();
        int day=r.nextInt(4)+1;
        System.out.println(day);




        while (day > 0) {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException exc) {
                System.out.println(" 5 sekundowa przerwa w watku 5 sekund 1 dzien");
                return;
            }
            day--;
            System.out.println(day + " " + "dzien");

        }
        ics.selflift[0]=null;

        System.out.println(" koniec "+" "+ ics+" "+ car);
    }
}
