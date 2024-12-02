package com.driver;

public class Boat implements WaterVehicle{

    private String name;
    private int capacity;

    @Override
    public String getVehicleName() {
        return name;
    }

    @Override
    public int getVehicleCapacity() {
        return capacity;
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public int getcapacity() {
        return capacity;
    }

    public void setcapacity(int capacity) {
        this.capacity = capacity;
    }
}
