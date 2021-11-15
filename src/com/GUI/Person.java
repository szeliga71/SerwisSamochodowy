package com.GUI;

import java.util.ArrayList;
import java.util.List;

public class Person <T extends Service , K extends Item>{
    private List<T>consumerWarehouseAndParkingList;
    private List<T>consumerParkingList;
    public  List<K>consumerItemsList;
    public List<K>consumerCarList;
    public List<TenantAlert>alerty;



    static int nr=0;
    public int id;
    public String imie;
    public String nazwisko;
    public int PESEL;
    public String adres_zamieszkania;
    public int data_ur;
    public int data_pierwszego_najmu;  //jak nie bylo to wyjatek NeverRentException

    public Person(){}

    public Person(String imie, String nazwisko, int PESEL, String adres_zamieszkania, int data_ur, int data_pierwszego_najmu) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.PESEL = PESEL;
        this.adres_zamieszkania = adres_zamieszkania;
        this.data_ur = data_ur;
        this.data_pierwszego_najmu = data_pierwszego_najmu;
        this.consumerWarehouseAndParkingList=new ArrayList<>();
        this.consumerItemsList=new ArrayList<>();
        this.consumerParkingList=new ArrayList<>();
        this.consumerCarList=new ArrayList<>();
        this.alerty=new ArrayList<>();
        nr++;
        id=nr;

    }

    public List<K> getConsumerItemsList() {
        return consumerItemsList;
    }

    public void addWrehouse(T warehouse){
        consumerWarehouseAndParkingList.add(warehouse);

    }
public void showUserCars(){
        for(int i=0;i<consumerCarList.size();i++){
    System.out.print((i+1)+"."+" ");
    System.out.println(consumerCarList.get(i));
}
}

public void addParking(T parking){
        consumerParkingList.add(parking);
}
    public void showUserWarehouse(){
        System.out.println(consumerWarehouseAndParkingList);
    }
    public void showUserWarehouse1(){
        for(int i=0;i<consumerWarehouseAndParkingList.size();i++){
            System.out.print((i+1)+"."+" ");
            System.out.println(consumerWarehouseAndParkingList.get(i)+" ");
        }
    }
    public String showUserWarehouse2(){
        String s="";
        for(int i=0;i<consumerWarehouseAndParkingList.size();i++){
            s+=((i+1)+"."+" "+consumerWarehouseAndParkingList.get(i)+" "+"\n");
        }
    return s;}
    public Service getConsumerWarehouse(int a){
        Service warehouse=null;

        for(int i=0;i<consumerWarehouseAndParkingList.size();i++){
            if(i==a){
                warehouse=consumerWarehouseAndParkingList.get(i);
            }
        }

    return warehouse;  }


    public void showUserItem1(){
        for(int i=0;i<consumerItemsList.size();i++){
            System.out.print((i+1)+"."+" ");
            System.out.println(consumerItemsList.get(i));
        }
    }

    public void showUserItemInWarehouse(){
         for(int i=0;i<consumerWarehouseAndParkingList.size();i++){
             System.out.print((i+1)+"."+" ");
             System.out.println(consumerWarehouseAndParkingList.get(i));
        }
    }

    public void showUserItem(){
        System.out.println(consumerItemsList);}


public void addItems(K item){
        consumerItemsList.add(item);}

public void addItemsToWarehouse(Item item,Service warehouse) {

        if(consumerWarehouseAndParkingList.contains(warehouse)){
            System.out.println("OK");}else{
            System.out.println("nie masz kluczy do tego pomieszczenia");}
        if(consumerItemsList.contains(item)){
            warehouse.getItemWarehouseList().add(item);
            consumerItemsList.remove(item);}
        else{
            System.out.println(" Brak uprawnien do tego przedmiotu");}

}






public Item getItemFromItemList(int a){
        Item item=null;

        for(int i=0;i<consumerItemsList.size();i++){
if(i==a){
    item=consumerItemsList.get(i);


}
        }
    return item;}

    public Item getCarFromItemList(int a){
        Item item=null;

        for(int i=0;i<consumerCarList.size();i++){
            if(i==a){
                item=consumerCarList.get(i);


            }
        }
        return item;}

public void addCar(K car){
        consumerCarList.add(car);

}
        public void showItemListInWarehouse(int a){
            getConsumerWarehouse(a).getItemWarehouseList();
        }



        public Item getItemFromWarehouseItemList(int a,ConsumerWarehouse warehouse){

                Item item=null;

        for(int i=0;i<warehouse.itemWarehouseList.size();i++){
        if(i==a){
            item=warehouse.itemWarehouseList.get(i); }
        }
    return item;}


        public void removeItemFromWarehouseItemList(Item item,ConsumerWarehouse warehouse){

        }

public boolean checkSize(ConsumerWarehouse warehouse,Item item){
        boolean toMuch=false;
        int size=0;
        for(int i=0;i<warehouse.getItemWarehouseList().size();i++)
            if(warehouse.getItemWarehouseList()!=null){
                size+=warehouse.getItemWarehouseList().get(i).rozmiar;}
        if((size+item.rozmiar)>warehouse.getArea()){
            toMuch=true;}
        return toMuch;}

    public String toString(){
        return   imie+" "+nazwisko+" "+"PESEL:"+" "+PESEL+" "+"adres zamieszkania :"+" "+adres_zamieszkania+" "+"data urodzenia :"+" "+data_ur+" "+data_pierwszego_najmu;//+" "+consumerWarehouseAndParkingList;
    }

}
