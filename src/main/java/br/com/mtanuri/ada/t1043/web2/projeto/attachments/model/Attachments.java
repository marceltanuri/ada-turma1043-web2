package br.com.mtanuri.ada.t1043.web2.projeto.attachments.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
public class Attachments {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    String id;

    String name;
    String description;
    String encodeBase64;
    String imageSize;
    LocalDateTime createdAt;
}
