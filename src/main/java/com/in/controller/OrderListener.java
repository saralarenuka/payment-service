package com.in.controller;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.in.model.Order;

@Component
public class OrderListener {

    @JmsListener(destination = "order.queue")
    public void receiveOrder(String item) {
        System.out.println("Received order: "+item);
    }
}