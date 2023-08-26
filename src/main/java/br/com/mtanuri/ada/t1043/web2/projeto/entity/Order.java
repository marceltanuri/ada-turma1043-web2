package br.com.mtanuri.ada.t1043.web2.projeto.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@Table(name = "tb_order")
public class Order {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "user_id")
    @JsonIgnore
    private User user;
    @OneToMany(mappedBy = "order")
    private List<OrderItem> orderItems;
    private Double totalPrice;

    public Order(User user) {
        this.user = user;
        this.orderItems = new ArrayList<>();
        this.totalPrice = 0.0;
    }

    public Order() {
        this.orderItems = new ArrayList<>();
        this.totalPrice = 0.0;
    }

    public void addOrderItem(OrderItem orderItem) {
        this.orderItems.add(orderItem);
        this.totalPrice += orderItem.total();
    }
}
