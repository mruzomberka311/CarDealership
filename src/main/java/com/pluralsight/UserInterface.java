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
        boolean running = true;

        while (running = true){
            displayMenu();
            String choice = scanner.nextLine();

            switch (choice.toUpperCase()){

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

    }
    private void processGetByMakeModelRequest(){

    }
    private void processGetByYearRequest(){

    }
    private void processGetByColorRequest(){

    }
    private void processGetByMileageRequest(){

    }
    private Vehicle processGetByVehicleTypeRequest(){
        return null;

    }
    private void processGetAllVehiclesRequest(){
       List<Vehicle> vehicles = dealership.getAllVehicles();
       displayVehicles(vehicles);
    }

    private Vehicle processAddVehicleRequest(){
        return null;

    }
    private Vehicle processRemoveVehicleRequest(){
        return null;

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
        for (Vehicle Vehicle : dealership.getAllVehicles()) {
            System.out.println(Vehicle);
        }
    }
}
