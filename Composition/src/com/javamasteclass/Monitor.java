package com.javamasteclass;

public class Monitor {
    private String model;
    private String manufacturer;
    private int size;
    //Resolution class is part of a Monitor class, Monitor isnt a Resolution, but it has a Resolution.
    //aka Resolution is a component of a Monitor.
    private Resolution nativeResolution;

    public Monitor(String model, String manufacturer, int size, Resolution nativeResolution) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.size = size;
        this.nativeResolution = nativeResolution;
    }

    public void drawPixelAt(int  x, int y, String colour){
        System.out.println("Drawing pixel at " + x + "," + y + " in colour " + colour);
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getSize() {
        return size;
    }

    public Resolution getNativeResolution() {
        return nativeResolution;
    }
}
