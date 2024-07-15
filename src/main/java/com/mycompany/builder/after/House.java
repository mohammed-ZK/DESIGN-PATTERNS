/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.builder.after;

public class House {
    private int rooms;
    private int doors;
    private int windows;
    private String roofType;
    private boolean hasGarage;
    private boolean hasSwimmingPool;

    private House(HouseBuilder builder) {
        this.rooms = builder.rooms;
        this.doors = builder.doors;
        this.windows = builder.windows;
        this.roofType = builder.roofType;
        this.hasGarage = builder.hasGarage;
        this.hasSwimmingPool = builder.hasSwimmingPool;
    }

    // طرق لطباعة تفاصيل البيت
    public void printDetails() {
        System.out.println("House with " + rooms + " rooms, " + doors + " doors, " + windows + " windows, " +
                           "roof type: " + roofType + ", has garage: " + hasGarage + ", has swimming pool: " + hasSwimmingPool);
    }

    public static class HouseBuilder {
        private int rooms;
        private int doors;
        private int windows;
        private String roofType;
        private boolean hasGarage;
        private boolean hasSwimmingPool;

        public HouseBuilder setRooms(int rooms) {
            this.rooms = rooms;
            return this;
        }

        public HouseBuilder setDoors(int doors) {
            this.doors = doors;
            return this;
        }

        public HouseBuilder setWindows(int windows) {
            this.windows = windows;
            return this;
        }

        public HouseBuilder setRoofType(String roofType) {
            this.roofType = roofType;
            return this;
        }

        public HouseBuilder setHasGarage(boolean hasGarage) {
            this.hasGarage = hasGarage;
            return this;
        }

        public HouseBuilder setHasSwimmingPool(boolean hasSwimmingPool) {
            this.hasSwimmingPool = hasSwimmingPool;
            return this;
        }

        public House build() {
            return new House(this);
        }
    }
}