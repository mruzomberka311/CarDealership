package com.pluralsight;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.*;

public class Dealership
{
    Scanner scanner = new Scanner(System.in);
    private String name;
    private String address;
    private String phone;
    private ArrayList<Vehicle> inventory = new ArrayList<>();

    public Dealership(String name, String address, String phone)
    {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.inventory =  new ArrayList <>();
    }

    public void addVehicle(Vehicle vehicle)
    {
        try
        {

            System.out.println("Please enter the vehicle VIN");
            int vin = Integer.parseInt(scanner.nextLine());
            System.out.println("Please enter the vehicle year");
            int year = Integer.parseInt(scanner.nextLine());
            System.out.println("Please enter the make and model");
            String make = scanner.nextLine();
            System.out.println("Please enter the vehicle model");
            String model = scanner.nextLine();
            System.out.println("Please enter the vehicle color");
            String color = scanner.nextLine();
            System.out.println("Please enter the vehicle type");
            String vehicleType = scanner.nextLine();
            System.out.println("Please enter the total mileage");
            int odometer = scanner.nextInt();
            System.out.println("Please enter the vehicle price");
            double price = scanner.nextDouble();

            Vehicle addVehicle = new Vehicle(vin, year, make, model, color, vehicleType, odometer, price);
            inventory.add(addVehicle);
            System.out.println("Vehicle added successfully!");

            FileWriter fileWriter = new FileWriter("dealership.csv");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(addVehicle.toString());
            bufferedWriter.newLine();
            bufferedWriter.close();
        }

        catch (Exception e)
        {
            System.err.println("Error writing the vehicle to the file");
            e.printStackTrace();
        }
    }

    public void removeVehicle(Vehicle vehicle){
        inventory.remove(vehicle);
    }

    public List<Vehicle> getAllVehicles(){
        return null;
    }

    public List<Vehicle> getVehiclesByPrice(double min, double max){
        for (Vehicle price : inventory){


            }

        }


    public List<Vehicle> getVehiclesByMakeModel(String make, String model)
    {
        for (Vehicle vehicle : inventory)
        {
            String vehicleMake = vehicle.getMake();
            String vehicleModel = vehicle.getModel();
            if (make.equalsIgnoreCase(vehicleMake) || model.equalsIgnoreCase(vehicleModel))
            {
                return;
            }
        }
    }

    public List<Vehicle> getVehiclesByYear(int min, int max){
        return null;
    }

    public List<Vehicle> getVehiclesByColor(String color)
    {
        List<Vehicle> listByColor = new ArrayList<>();
        for (Vehicle vehicle : inventory)
        {
            if (vehicle.getColor().equalsIgnoreCase(color)) {
                listByColor.add(vehicle);
            }
        }
        return listByColor;
    }


    public List<Vehicle> getVehiclesByMileage(int min, int max){
        return null;
    }

    public List<Vehicle> getVehiclesByType(String vehicleType) {
        for (Vehicle vehicle : inventory) {
            String typeOfVehicle = vehicle.getVehicleType();
            if (vehicleType.equalsIgnoreCase(vehicleType)) {
                return;
            }
        }
        }

            public String getName () {
                return name;
            }

            public void setName (String name){
                this.name = name;
            }

            public String getAddress () {
                return address;
            }

            public void setAddress (String address){
                this.address = address;
            }

            public String getPhone () {
                return phone;
            }

            public void setPhone (String phone){
                this.phone = phone;
            }

        }
