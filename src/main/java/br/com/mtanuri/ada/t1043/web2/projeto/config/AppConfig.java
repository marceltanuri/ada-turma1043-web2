package br.com.mtanuri.ada.t1043.web2.projeto.config;

import br.com.mtanuri.ada.t1043.web2.projeto.dto.OrderDTO;
import br.com.mtanuri.ada.t1043.web2.projeto.entity.Order;
import br.com.mtanuri.ada.t1043.web2.projeto.entity.OrderItem;
import br.com.mtanuri.ada.t1043.web2.projeto.entity.Product;
import br.com.mtanuri.ada.t1043.web2.projeto.entity.User;
import br.com.mtanuri.ada.t1043.web2.projeto.respository.OrderItemRepository;
import br.com.mtanuri.ada.t1043.web2.projeto.respository.OrderRepository;
import br.com.mtanuri.ada.t1043.web2.projeto.respository.ProductRepository;
import br.com.mtanuri.ada.t1043.web2.projeto.respository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig implements CommandLineRunner {

    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private OrderItemRepository orderItemRepository;

    @Override
    public void run(String... args) throws Exception {
        User user = new User("1", "2", "3", null);
        Product product = new Product("", "", 4.0);
        OrderItem orderItem = new OrderItem(product, 2);
        Order order = new Order(user);
        order.addOrderItem(orderItem);

        this.userRepository.save(user);
        this.productRepository.save(product);
        this.orderRepository.save(order);
    }
}
