package com.GUI;

public class ParkingSpace extends Service {
    private int area;
    public boolean isFreee;
    private static int poz;
    private int nr;
    Pojazd[]parkingPlace;

    public ParkingSpace(int area,boolean isFreee){
        this.isFreee=isFreee;
        this.area=area;
        poz++;
    nr=poz;
    parkingPlace=new Pojazd[1];
    }
    public void czyWolne(){
        if(isFreee){
            System.out.println(" WOLNE ");
        }
    }

    public int getArea() {
        return area;
    }

    public boolean isFreee() {
        return isFreee;
    }

    public static int getPoz() {
        return poz;
    }

    public int getNr() {
        return nr;
    }

    public Pojazd[] getParkingPlace() {
        return parkingPlace;
    }
    public void removeFromParking(){
        parkingPlace=null;
    }


    public void setParkingPlace(Pojazd[] parkingPlace) {
        this.parkingPlace = parkingPlace;
    }

    public String isFREEE(){
        String s=null;
        if(isFreee){
            s=" miejsce parkingowe niewynajete ";}
        else{s= "miejsce parkingowe wynajete ";}

        return s;}

        public String parkingBusy(){
        String s=null;
        if(parkingPlace[0]==null){
            s= "miejsce parkingowe jest puste ";}
            else{
                s="na tym miejscu jest zaparkowany samochod ";
        }
        return s;}


    public String toString()
{return "Miejsce parkingowe nr " + nr+"."+" "+isFREEE()+" "+parkingBusy();}
}
