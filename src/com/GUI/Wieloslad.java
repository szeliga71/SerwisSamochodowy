package com.GUI;

public class Wieloslad extends Pojazd implements RodzajPojazdu {
    boolean czyPlywa;

    public Wieloslad(int rozmiar, String marka, String modell, RodzajNapedu naped, boolean czyPlywa, boolean czyMiejski) {
        super(rozmiar, marka, modell,naped,czyMiejski);
        this.czyPlywa = czyPlywa;
    }

    @Override
    public String toString() {
        return RodzajPojazdu(czyMiejski)+" "+marka+" "+modell+" "+naped+" "+czyAmfibia(czyPlywa);}




   /* public boolean czyAmfibia(boolean czyPlywa) {
        boolean plywajaca;
        if(czyPlywa){
        plywajaca=true;
        System.out.print(" Pojazd jest amfibia");}
        else{
            plywajaca=false;
            System.out.println(" pojazd nie jest amfibia");}
   return plywajaca; }*/
}
