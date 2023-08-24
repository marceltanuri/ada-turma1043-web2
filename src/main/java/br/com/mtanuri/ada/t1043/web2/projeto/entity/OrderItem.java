package br.com.mtanuri.ada.t1043.web2.projeto.entity;

import java.util.List;

public class OrderItem {

    private Product product;
    private Integer quantity;
    public Double getTotal() {
        return this.product.getPrice() * this.quantity;
    }
}
