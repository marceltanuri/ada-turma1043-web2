package br.com.mtanuri.ada.t1043.web2.projeto.entity;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private List<OrderItem> orderItems;
    private Double totalPrice;

    public Order() {
        this.orderItems = new ArrayList<>();
        this.totalPrice = 0.0;
    }

    public void addOrderItem(OrderItem orderItem) {
        this.orderItems.add(orderItem);
        this.totalPrice += orderItem.getTotal();
    }
}
