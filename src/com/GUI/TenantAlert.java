package com.GUI;

public class TenantAlert extends Person{
    Person person;
    public TenantAlert(Person person){
        this.person=person;
    }
    public TenantAlert(String imie, String nazwisko, int PESEL, String adres_zamieszkania, int data_ur, int data_pierwszego_najmu) {
        super(imie, nazwisko, PESEL, adres_zamieszkania, data_ur, data_pierwszego_najmu);
    }
}
