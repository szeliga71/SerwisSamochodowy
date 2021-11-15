package com.GUI;

import com.GUI.Service;

public class ServiceWarehouse extends Service {

    private int area;


    public ServiceWarehouse(int area){
        this.area=area;

    }

    public int getArea() {
        return area;
    }

    @Override
    public String toString() {
        return "ServiceWarehouse{" +
                "area=" + area +
                '}';
    }
}
