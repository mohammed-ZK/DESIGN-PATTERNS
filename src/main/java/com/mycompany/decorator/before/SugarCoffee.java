/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.decorator.before;

/**
 *
 * @author moham
 */
public class SugarCoffee extends Coffee {
    @Override
    public String getDescription() {
        return super.getDescription() + ", with sugar";
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.5;
    }
}