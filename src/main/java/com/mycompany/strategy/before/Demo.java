/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.strategy.before;

/**
 *
 * @author moham
 */
public class Demo {
    public static void main(String[] args) {
        Payment payment = new Payment();
        payment.pay("credit", 100.0);
        payment.pay("paypal", 200.0);
    }
}
