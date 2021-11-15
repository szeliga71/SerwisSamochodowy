package com.GUI;

public class Zlecenie extends Thread{


    public void run(){
        int time=5;
        while(time>0){
            try{
                this.sleep(1000);
            }catch(InterruptedException exc){
                System.out.println("pause");
                return;

            }
            time--;
                System.out.println("dzien"+" "+time);


        }
    }
}
