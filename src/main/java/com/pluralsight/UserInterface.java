package com.pluralsight;

public class UserInterface {
    private Dealership dealership;


    public UserInterface(){

    }
private void init() {
    DealershipFileManager manager = new DealershipFileManager();
    this.dealership = manager.getDealership();
}
    public void display(){
        init();


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

    }
    private Vehicle processGetAllVehiclesRequest(){

    }
    private Vehicle processAddVehicleRequest(){

    }
    private Vehicle processRemoveVehicleRequest(){

    }
}
