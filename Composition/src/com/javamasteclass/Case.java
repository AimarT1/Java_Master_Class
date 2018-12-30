package com.javamasteclass;

public class Case {
    private String model;
    private String manufacturer;
    private String powerSuply;
    private Dimentions dimentions;

    public Case(String model, String manufacturer, String powerSuply, Dimentions dimentions) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.powerSuply = powerSuply;
        this.dimentions = dimentions;
    }

    public void  pressPowerButton(){
        System.out.println("Power button pressed");
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getPowerSuply() {
        return powerSuply;
    }

    public Dimentions getDimentions() {
        return dimentions;
    }
}
