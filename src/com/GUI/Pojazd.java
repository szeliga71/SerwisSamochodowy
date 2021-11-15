package com.GUI;

 public class Pojazd extends Item{

    String marka;
    String modell;
    RodzajNapedu naped;
    boolean czyMiejski;

    public Pojazd(int rozmiar, String marka, String modell, RodzajNapedu naped, boolean czyMiejski) {
        super(rozmiar);
        this.marka = marka;
        this.modell = modell;
        this.naped=naped;
        this.czyMiejski=czyMiejski;
    }



}
