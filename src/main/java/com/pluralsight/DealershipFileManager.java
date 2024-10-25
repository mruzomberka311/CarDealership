package com.pluralsight;
import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class DealershipFileManager
{

    public Dealership getDealership()
    {
        File file = new File("dealership.csv");
        String line;
        Dealership dealership = null;

        if (file.exists()) {
            try {
                FileReader fileReader = new FileReader(file);
                BufferedReader bufferedReader = new BufferedReader(fileReader);


                while ((line = bufferedReader.readLine()) != null) {
                    System.out.println(line);
                    String[] titleParts = line.split("\\|");
                    if (titleParts.length == 3) {
                        String name = titleParts[0];
                        String address = titleParts[1];
                        String phone = titleParts[2];
                        dealership = new Dealership(name, address, phone);

                    }
                    String[] tokens = line.split("\\|");
                    if (tokens.length == 8) {
                        int vin = Integer.parseInt(tokens[0]);
                        int year = Integer.parseInt(tokens[1]);
                        String make = tokens[2];
                        String model = tokens[3];
                        String vehicleType = tokens[4];
                        String color = tokens[5];
                        int odometer = Integer.parseInt(tokens[6]);
                        double price = Double.parseDouble(tokens[7]);
                        Vehicle vehicle = new Vehicle(vin, year, make, model, vehicleType, color, odometer, price);
                        dealership.addVehicle(vehicle);
                    }
                }


            } catch (Exception e) {
                System.err.println("Error processing file");
                e.printStackTrace();
            }

        }
        return dealership;
    }

    public void saveDealership(Dealership dealership)
    {
                
    }
}