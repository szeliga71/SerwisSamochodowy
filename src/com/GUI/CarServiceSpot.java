package com.GUI;

public class CarServiceSpot extends Service {
    public boolean isFree;
    private int area;



public CarServiceSpot(int area,boolean isFree){
    this.area=area;
    this.isFree=isFree;
}
    Item []lift = new Item[1];

    public boolean isFree() {
        return isFree;
    }

public String isFREE(){
    String s=null;
    if(isFree){
        s=" Stanowisko serwisowe dostepne ";
    }else{
        s=" Stanowisko serwisowe  zajete  ";
    }
return s;}
    public void setFree(boolean free) {
        isFree = free;
    }

    @Override
    public String toString() {
        return  area+" "+ isFREE()+" "+lift[0];
    }
}
