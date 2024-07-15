/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.builder.after;

/**
 *
 * @author moham
 */
public class Demo {
    public static void main(String[] args) {
        House house = new House.HouseBuilder()
                            .setRooms(4)
                            .setDoors(2)
                            .setWindows(6)
                            .setRoofType("Gable")
                            .setHasGarage(true)
                            .setHasSwimmingPool(false)
                            .build();
        house.printDetails();
    }
}