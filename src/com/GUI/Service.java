package com.GUI;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;


public class Service {
    private String adress;
    //private ArrayList<ParkingSpace> parking1;
    //private ParkingSpace[] parking;
    private int area=1800;


    public Service() {
    }

    public Service(String adress) {
        this.adress = adress; }



        //ConsumerWarehouse[] consWare = new ConsumerWarehouse[8];
        //parking=new ParkingSpace[6];


    public String getAdress() {
        return adress;
    }

    public int getArea() {
        return area;
    }

    public String toString(){
        return adress + " "+area; }//+parking+consWare

    public Collection<Item> getItemWarehouseList() {
        return null;
    }

}
