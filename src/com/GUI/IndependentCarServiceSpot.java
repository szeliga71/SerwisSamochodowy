package com.GUI;


public class IndependentCarServiceSpot extends Service {

    int area;
    public IndependentCarServiceSpot(int area){
        this.area=area;
    }
    Item []selflift = new Item[1];

    public Item[] getSelflift() {
        return selflift;
    }
}
