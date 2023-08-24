package br.com.mtanuri.ada.t1043.web2.projeto.users.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    String id;

    String address1;
    String address2;
    String zipCode;
    String city;
    String country;
    LocalDateTime createdAt;
}
