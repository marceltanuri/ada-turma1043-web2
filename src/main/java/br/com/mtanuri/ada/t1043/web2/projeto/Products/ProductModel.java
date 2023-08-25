package br.com.mtanuri.ada.t1043.web2.projeto.Products;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.math.BigDecimal;
@Entity
@Data
public class ProductModel {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String name;
        private BigDecimal price;
        private BigDecimal discount;
        private Integer supply;
        private String description;
}
