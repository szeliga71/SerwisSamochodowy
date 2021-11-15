package com.GUI;

public class Jednoslad extends Pojazd implements RodzajPojazdu{

    public Jednoslad(int rozmiar, String marka, String modell, RodzajNapedu naped, boolean czyMiejski) {
        super(rozmiar, marka, modell, naped,czyMiejski);
    }

    @Override
    public String toString() {
        return



                "Jednoslad{" +
                "rozmiar=" + rozmiar +
                ", marka='" + marka + '\'' +
                ", modell='" + modell + '\'' +
                ", naped=" + naped +
                ", czyMiejski=" + RodzajPojazdu(czyMiejski) +
                '}';
    }
}

