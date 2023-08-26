package br.com.mtanuri.ada.t1043.web2.projeto.service;

import br.com.mtanuri.ada.t1043.web2.projeto.dto.OrderItemDTO;
import br.com.mtanuri.ada.t1043.web2.projeto.entity.Order;
import br.com.mtanuri.ada.t1043.web2.projeto.entity.OrderItem;
import br.com.mtanuri.ada.t1043.web2.projeto.entity.Product;
import br.com.mtanuri.ada.t1043.web2.projeto.respository.OrderItemRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class OrderItemServiceImpl implements OrderItemService {

    private final OrderServiceImpl orderService;
    private final ProductServiceImpl productService;
    private final OrderItemRepository orderItemRepository;

    @Override
    public OrderItem insertOrderItem(OrderItemDTO orderItemDTO) {
        Order order = this.orderService.getOrderById(orderItemDTO.getOrderId());
        Product product = this.productService.getProductById(orderItemDTO.getProductId());
        OrderItem orderItem = new OrderItem(order, product, orderItemDTO.getQuantity());
        order.addOrderItem(orderItem);
        this.orderService.updateOrder(order);
        return this.orderItemRepository.save(orderItem);
    }
}
