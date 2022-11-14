package com.restaurant;

import java.util.ArrayList;
import java.util.List;

import static com.restaurant.Side.BUY;

public class MethodTesting {
    public static void main(String[] args) {
        Stock stock = new Stock();
        Order order1 = new Order(BUY, 10.0);
        Order order2 = new Order(BUY, 12.0);


        stock.orders.add(order1); //bez metody

        stock.placeOrder(order1); //z metoda
    }

}

class Stock {
    public List<Order> orders = new ArrayList<>();

    public void placeOrder(Order order) {
        orders.add(order);
    }
}

class Order {
    private Side side;
    private double amount;

    public Order(Side side, double amount) {
        this.side = side;
        this.amount = amount;
    }
}

enum Side {
    BUY, SELL
}