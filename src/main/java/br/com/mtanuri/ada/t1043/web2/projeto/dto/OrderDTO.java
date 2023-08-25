package br.com.mtanuri.ada.t1043.web2.projeto.dto;

import br.com.mtanuri.ada.t1043.web2.projeto.entity.OrderItem;
import br.com.mtanuri.ada.t1043.web2.projeto.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
public class OrderDTO {

    private User user;
    private List<OrderItem> orderItems;
    private Double totalPrice;

    public OrderDTO() {
        this.orderItems = new ArrayList<>();
        this.totalPrice = 0.0;
    }

    public void addOrderItem(OrderItem orderItem) {
        this.orderItems.add(orderItem);
        this.totalPrice += orderItem.total();
    }
}
