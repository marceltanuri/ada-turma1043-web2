package br.com.mtanuri.ada.t1043.web2.projeto.service;

import br.com.mtanuri.ada.t1043.web2.projeto.dto.OrderDTO;
import br.com.mtanuri.ada.t1043.web2.projeto.entity.Order;

import java.util.List;

public interface OrderService {

    Order insertOrder(OrderDTO orderDTO);
    List<Order> getAllOrders();

    Order getOrderById(Long orderId);

    Order updateOrder(Order order);
}
