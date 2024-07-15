/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.strategy.before;

/**
 *
 * @author moham
 */
public class Payment {
    public void pay(String type, double amount) {
        if (type.equals("credit")) {
            payWithCreditCard(amount);
        } else if (type.equals("paypal")) {
            payWithPayPal(amount);
        }
    }

    private void payWithCreditCard(double amount) {
        System.out.println("Paying " + amount + " using Credit Card.");
    }

    private void payWithPayPal(double amount) {
        System.out.println("Paying " + amount + " using PayPal.");
    }
}