package br.com.mtanuri.ada.t1043.web2.projeto.orders.model;

import br.com.mtanuri.ada.t1043.web2.projeto.products.model.Product;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class OrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    String id;
    Product product;
    Integer quantity;
    Double discount;
}
