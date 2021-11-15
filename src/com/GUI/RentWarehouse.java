package com.GUI;

public class RentWarehouse implements Runnable {


        Person user;
        ConsumerWarehouse warehouse;

        public RentWarehouse(Person user, ConsumerWarehouse warehouse ){
            this.user=user;
            this.warehouse=warehouse;
        }

    public void run(){

        user.addWrehouse(warehouse);
        warehouse.czyWolne=false;
        System.out.println(" pomieszczenie nr "+ warehouse + " " +" wynajmujacy : "+" " +user.imie+" "+user.nazwisko);
        int day =30;
        while(day>0){
            try{
                Thread.sleep(5000);
            }catch(InterruptedException exc){
                System.out.println(" 5 sekundowa przerwa w watku");
                return ;
            }
            day--;
            System.out.println(day+" "+"dzien");
            TenantAlert tn=new TenantAlert(user);
            user.alerty.add(tn);
        }
        //przekazanie alertu i po alercie usuniecie magazynu z listy
        System.out.println("koniec najmu"+" "+ warehouse+" "+user.nazwisko );
    }

}
