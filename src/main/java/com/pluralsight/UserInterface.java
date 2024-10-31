package com.pluralsight;

import java.util.List;
import java.util.Scanner;

public class UserInterface {
    private Dealership dealership;

    Scanner scanner = new Scanner(System.in);

    public UserInterface(){

    }
private void init() {
    DealershipFileManager manager = new DealershipFileManager();
    this.dealership = manager.getDealership();
}
    public void display(){

        init();
        displayMenu();

        boolean running = true;

        while (running){

            String choice = scanner.nextLine();

            switch (choice.toUpperCase())
            {

                case "P":
                    processGetByPriceRequest();
                    break;

                case "M":
                    processGetByMakeModelRequest();
                    break;

                case "Y":
                    processGetByYearRequest();
                    break;

                case "C":
                    processGetByColorRequest();
                    break;

                case "G":
                    processGetByMileageRequest();
                    break;

                case "T":
                    processGetByVehicleTypeRequest();
                    break;

                case "A":
                    processGetAllVehiclesRequest();
                    break;

                case "+":
                    processAddVehicleRequest();
                    break;

                case "-":
                    processRemoveVehicleRequest();
                    break;

                case "X":
                    running = false;
                    break;

                default:
                    System.out.println("Invalid option");
                    break;

            }
        }
    }


    private void processGetByPriceRequest(){
        System.out.println("Please enter a min price");
        double min = scanner.nextDouble();
        System.out.println("Please enter a max price");
        double max = scanner.nextDouble();
        dealership.getVehiclesByPrice(min, max);
    }
    private void processGetByMakeModelRequest(){
        System.out.println("Please enter the make of the vehicle");
        String make = scanner.nextLine();
        System.out.println("Please enter the model of the vehicle");
        String model = scanner.nextLine();
        dealership.getVehiclesByMakeModel(make,model);
    }
    private void processGetByYearRequest(){
        System.out.println("Please enter the min year");
        int min = scanner.nextInt();
        System.out.println("Please enter the max year");
        int max = scanner.nextInt();
        dealership.getVehiclesByYear(min,max);

    }
    private void processGetByColorRequest(){
        System.out.println("Please enter a vehicle color");
        String color = scanner.nextLine();
        dealership.getVehiclesByColor(color);

    }
    private void processGetByMileageRequest(){
        System.out.println("Please enter the min mileage");
        int min = scanner.nextInt();
        System.out.println("Please enter the max mileage");
        int max = scanner.nextInt();
        dealership.getVehiclesByMileage(min,max);

    }
    private void processGetByVehicleTypeRequest(){
        System.out.println("Please enter a vehicle type");
        String vehicleType = scanner.nextLine();
        dealership.getVehiclesByType(vehicleType);

    }
    private void processGetAllVehiclesRequest(){
       List<Vehicle> vehicles = dealership.getAllVehicles();
       displayVehicles(vehicles);
    }

    private void processAddVehicleRequest(){
        dealership.addVehicle();

    }
    private void processRemoveVehicleRequest(){
        System.out.println("What vehicle would you like to remove from inventory?");
        int vin = Integer.parseInt(scanner.nextLine());
       dealership.removeVehicle(vin);

    }

    private void displayMenu(){
        System.out.println("Welcome to the dealership menu!");
        System.out.println("P) Price request");
        System.out.println("M) Make/Model request");
        System.out.println("Y) Year request");
        System.out.println("C) Color request");
        System.out.println("G) Mileage request");
        System.out.println("T) Vehicle Type request");
        System.out.println("A) All Vehicles request");
        System.out.println("+) Add Vehicle request");
        System.out.println("-) Remove Vehicle request");
        System.out.println("X) Exit");
    }

    private void displayVehicles(List<Vehicle> vehicles){
        for (Vehicle vehicle : dealership.getAllVehicles()) {
            System.out.println(vehicle);
        }
    }
}
