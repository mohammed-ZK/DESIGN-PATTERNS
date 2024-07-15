/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.builder.before;

/**
 *
 * @author moham
 */
public class House {
    private int rooms;
    private int doors;
    private int windows;
    private String roofType;
    private boolean hasGarage;
    private boolean hasSwimmingPool;

    public House(int rooms, int doors, int windows, String roofType, boolean hasGarage, boolean hasSwimmingPool) {
        this.rooms = rooms;
        this.doors = doors;
        this.windows = windows;
        this.roofType = roofType;
        this.hasGarage = hasGarage;
        this.hasSwimmingPool = hasSwimmingPool;
    }

    // طرق لطباعة تفاصيل البيت
    public void printDetails() {
        System.out.println("House with " + rooms + " rooms, " + doors + " doors, " + windows + " windows, " +
                           "roof type: " + roofType + ", has garage: " + hasGarage + ", has swimming pool: " + hasSwimmingPool);
    }
}
