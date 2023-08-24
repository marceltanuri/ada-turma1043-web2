package br.com.mtanuri.ada.t1043.web2.projeto.products.model;

import br.com.mtanuri.ada.t1043.web2.projeto.attachments.model.Attachments;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    String id;

    String description;
    ProductCategory category;
    Integer quantityInStock;
    BigDecimal price;
    LocalDateTime createdAt;
    List<Attachments> images;
}
