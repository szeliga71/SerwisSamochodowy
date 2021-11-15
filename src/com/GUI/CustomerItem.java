package com.GUI;

public class CustomerItem extends Item{

    String itemName;
    static int id=0;
    int nr;

    public CustomerItem(int rozmiar,String itemName){
        super(rozmiar);
        this.itemName=itemName;
        id++;
        nr=id;
    }

    public String getItemName() {
        return itemName;
    }

    public static int getId() {
        return id;
    }

    public int getNr() {
        return nr;
    }


    @Override
    public String toString() {
        return itemName+" "+rozmiar;
    }
}
