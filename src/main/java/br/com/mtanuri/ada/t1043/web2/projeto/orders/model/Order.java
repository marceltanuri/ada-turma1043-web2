package br.com.mtanuri.ada.t1043.web2.projeto.orders.model;

import br.com.mtanuri.ada.t1043.web2.projeto.users.model.User;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    String id;
    @OneToMany
    List<OrderItem> itens;
    @ManyToOne
    User user;
    StatusOrder status;
    LocalDateTime createdAt;
}
