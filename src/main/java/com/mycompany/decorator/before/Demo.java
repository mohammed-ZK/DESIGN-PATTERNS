/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.decorator.before;

/**
 *
 * @author moham
 */
public class Demo {
    public static void main(String[] args) {
        Coffee coffee = new MilkCoffee();
        System.out.println(coffee.getDescription() + " costs " + coffee.getCost());

        Coffee sugarCoffee = new SugarCoffee();
        System.out.println(sugarCoffee.getDescription() + " costs " + sugarCoffee.getCost());
    }
}
