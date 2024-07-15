/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.abstractfactory.after;

public class AbstractFactoryPatternTest {
    public static void main(String[] args) {
        FurnitureFactory factory;
        String style = "Modern"; 

        if (style.equals("Modern")) {
            factory = new ModernFurnitureFactory();
        } else if (style.equals("Victorian")) {
            factory = new VictorianFurnitureFactory();
        } else {
            factory = new ArtDecoFurnitureFactory();
        }

        FurnitureShop shop = new FurnitureShop(factory);
        shop.showFurniture();
    }
}