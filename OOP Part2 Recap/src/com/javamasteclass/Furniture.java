package com.javamasteclass;

public class Furniture {
    private String bed;
    private String lamp;
    private String closet;
    private String carpet;
    private String desk;

    public Furniture(String bed, String lamp, String closet, String carpet, String desk) {
        this.bed = bed;
        this.lamp = lamp;
        this.closet = closet;
        this.carpet = carpet;
        this.desk = desk;
    }
    public void  designeRoom(){
        System.out.println("Time to designe the room ! First a "  + carpet + " ,then " + bed + " ,now a " + lamp +
                " ,then " +closet + ", and a beautful "  + desk + " desk.");
    }

    public String getBed() {
        return bed;
    }

    public String getLamp() {
        return lamp;
    }

    public String getCloset() {
        return closet;
    }

    public String getCarpet() {
        return carpet;
    }

    public String getDesk() {
        return desk;
    }
}
