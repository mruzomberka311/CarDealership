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

    public void addVehicle()
    {
        try
        {
            System.out.println("Please enter the vehicle VIN");
            int vin = scanner.nextInt();
            System.out.println("Please enter the vehicle year");
            int year = scanner.nextInt();
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

    public void removeVehicle(int vin) {
        for (Vehicle vehicle : inventory){
            if (vehicle.getVin() == vin){
                inventory.remove(vehicle);
            }
        }
    }

    public List<Vehicle> getAllVehicles(){
        return null;
    }

    public List<Vehicle> getVehiclesByPrice(double min, double max)
    {
        List<Vehicle> listByPrice = new ArrayList<>();

        for (Vehicle vehicle : inventory)
        {
            if (vehicle.getPrice() >= min && vehicle.getPrice() <= max)
            {
                listByPrice.add(vehicle);
            }

            }
            return listByPrice;
        }


    public List<Vehicle> getVehiclesByMakeModel(String make, String model)
    {
        List<Vehicle>listByMakeModel = new ArrayList<>();
        for (Vehicle vehicle : inventory)
        {
            if (vehicle.getMake().equalsIgnoreCase(make) || vehicle.getModel().equalsIgnoreCase(model))
            {
                listByMakeModel.add(vehicle);
            }
        }
        return listByMakeModel;
    }

    public List<Vehicle> getVehiclesByYear(int min, int max)
    {
        List<Vehicle> listByYear = new ArrayList<>();
        for (Vehicle vehicle : inventory)
        {
            if (vehicle.getYear()>= min && vehicle.getYear() <= max) {
                listByYear.add(vehicle);
            }
        }
        return listByYear;
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
        List<Vehicle> listByMileage = new ArrayList<>();
        for (Vehicle vehicle : inventory){
            if (vehicle.getOdometer() >= min && vehicle.getOdometer() <= max){
                listByMileage.add(vehicle);
            }
        }
        return listByMileage;
    }

    public List<Vehicle> getVehiclesByType(String vehicleType)
    {
        List<Vehicle> listByVehicleType = new ArrayList<>();
        for (Vehicle vehicle : inventory)
        {
            if (vehicle.getVehicleType().equalsIgnoreCase(vehicleType)) {
                listByVehicleType.add(vehicle);
            }
        }
        return listByVehicleType;
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
