package com.javamasteclass;

public class Monitor {
    private String model;
    private String manufacturer;
    private int screen_Size;
    //Creating a separate class for Resolution. Monitor isnt a resolution, but it has a resolution aka component.
    private Resolution nativeResolution;
    //Constructors
    public Monitor(String model, String manufacturer, int screen_Size, Resolution nativeResolution) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.screen_Size = screen_Size;
        this.nativeResolution = nativeResolution;
    }
    //Method
    public void drawPixelAt(int x, int y,String colour){
        System.out.println("Drawing pixel at " + x +","+ y + " in colour " + colour );
    }
//Getters
    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getScreen_Size() {
        return screen_Size;
    }

    public Resolution getNativeResolution() {
        return nativeResolution;
    }
}
