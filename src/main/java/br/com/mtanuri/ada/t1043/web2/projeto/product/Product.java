package br.com.mtanuri.ada.t1043.web2.projeto.product;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String title;

    @Column
    private String description;

    @Column
    private double price;

    @Column
    private double discountPercentage;

    @Column
    private double rating;

    @Column
    private int stock;

    @Column
    private String brand;

    @Column
    private String category;

    @Column
    private String thumbnail;
}
