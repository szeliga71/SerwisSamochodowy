package com.GUI;

public interface RodzajPojazdu {

    default public String RodzajPojazdu(boolean czyMiejski){

        String info=" ";
        if(czyMiejski){
            info=" pojazd osobowy";
        }
        else { info=" auto terenowe";
            }

        return info;}

    default public String czyAmfibia(boolean czyPlywa) {
         String info=" ";
        if(czyPlywa){
            info= " UWAGA!  Pojazd jest amfibia ";}

        return info; }


}




