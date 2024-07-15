/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.strategy.after;

import java.util.Arrays;

/**
 *
 * @author moham
 */
public class Demo {
    public static void main(String[] args) {
        Payment payment = new Payment();

        payment.setPaymentStrategy(new CreditCardPayment());
        payment.pay(100.0);

        payment.setPaymentStrategy(new PayPalPayment());
        payment.pay(200.0);
    }
}
