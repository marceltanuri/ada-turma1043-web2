package br.com.mtanuri.ada.t1043.web2.projeto.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@Table(name = "tb_order")
public class Order {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    @OneToMany(mappedBy = "order")
    private List<OrderItem> orderItems;
    private Double totalPrice;

    public Order(User user) {
        this.orderItems = new ArrayList<>();
        this.user = user;
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
