package com.GUI;

import java.util.ArrayList;
import java.util.List;

public class ConsumerWarehouse extends Service {
    private int area;
    static int poz = 0;
    private int no;
    private int data_roz_najmu;
    private int data_zako_najmu;
    public boolean czyWolne;
   public  List<Item> itemWarehouseList;


    public ConsumerWarehouse(String adress, int area, boolean czyWolne) {
        super(adress);
        this.area = area;
        this.czyWolne = czyWolne;
        itemWarehouseList = new ArrayList<>();
        poz++;
        no = poz;


    }

    @Override
    public int getArea() {
        return area;
    }

    public void setCzyWolne(boolean czyWolne) {
        this.czyWolne = czyWolne;
    }


    public List<Item> getItemWarehouseList() {

        return itemWarehouseList;
    }

    public Item getItemFromCustomerWarehouseItemList(int a){
    Item item=null;
    for(int i=0;i<itemWarehouseList.size();i++){
        if(i==a){
            item =itemWarehouseList.get(i);
        }
    }
    return item;}

    public void setItemWarehouseList(List<Item> itemWarehouseList) {
        this.itemWarehouseList = itemWarehouseList;
    }

    public void showItemListInWarehouse() {
        for (int i = 0; i < itemWarehouseList.size(); i++) {

            System.out.println(itemWarehouseList.get(i));
        }


    }

    public boolean czyWolne() {
        return czyWolne;
    }

    public String ISfREE() {
        String s = null;
        if (czyWolne) {
            s = " pomieszczenie wolne ";
        } else {
            s = " pomieszczenie wynajete ";
        }
        return s;
    }

    public String itemWarehouseListPrint() {
        String s = null;
        int a = 0;
        for (int i = 0; i < itemWarehouseList.size(); i++) {
            if (itemWarehouseList.get(i) != null) {
                a++;
            }
        }
        if (a == 0) {
            s = "Magazyn jest pusty ";
        } else {
            s = itemWarehouseList.toString();
        }

        return s;
    }

    public String toString() {
        return "Magazyn numer :" + " " + no + "." + " " + "powierzchnia :" + " " + area + " " + ISfREE() + " " + itemWarehouseListPrint();
    }

}
