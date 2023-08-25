package br.com.mtanuri.ada.t1043.web2.projeto.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "tb_address")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @OneToOne(mappedBy = "address")
    private User user;
    private String street;
    private long number;
    private String district;
    private String city;
    private String postalCode;
    private String state;
    private String country;
    private String complement;
}
