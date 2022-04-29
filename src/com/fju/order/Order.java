package com.fju.order;

public class Order {
    int amount;
    Delivery delivery;

    public Order(int amount, Delivery delivery, int shipFeed) {
        this.amount = amount;
        this.delivery = delivery;
    }
    
    public int total(){
        int total = amount + delivery.price;
        return total();
    }
}
