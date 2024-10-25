package com.pluralsight;

import java.util.ArrayList;

public class Dealership
{

    private String name;
    private String address;
    private String phone;
    private ArrayList<Vehicle> inventory;

    public Dealership(String name, String address, String phone, ArrayList<Vehicle> inventory)
    {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.inventory = inventory = new ArrayList <Vehicle>();
    }

    public void addVehicle(){

    }
    public void removeVehicle(){

    }

    public void getAllVehicles(){

    }

    public void getVehiclesByPrice(){

    }
    public void getVehiclesByMakeModel(){

    }

    public void getVehiclesByYear(){

    }

    public void getVehiclesByColor(){

    }

    public void getVehiclesByMileage(){

    }

    public void getVehiclesByType(){

    }

    



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

}
