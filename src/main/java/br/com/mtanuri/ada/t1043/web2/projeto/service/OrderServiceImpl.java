package br.com.mtanuri.ada.t1043.web2.projeto.service;

import br.com.mtanuri.ada.t1043.web2.projeto.dto.OrderDTO;
import br.com.mtanuri.ada.t1043.web2.projeto.entity.Order;
import br.com.mtanuri.ada.t1043.web2.projeto.entity.User;
import br.com.mtanuri.ada.t1043.web2.projeto.respository.OrderRepository;
import br.com.mtanuri.ada.t1043.web2.projeto.respository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;
    private final UserServiceImpl userService;

    @Override
    public Order insertOrder(OrderDTO orderDTO) {
        User user = this.userService.findById(orderDTO.getUserId());
        Order order = new Order(user);
        return this.orderRepository.save(order);
    }

    public List<Order> getAllOrders() {
        return this.orderRepository.findAll();
    }

    @Override
    public Order getOrderById(Long orderId) {
        return this.orderRepository.findById(orderId).get();
    }

    @Override
    public Order updateOrder(Order order) {
        return this.orderRepository.save(order);
    }
}
