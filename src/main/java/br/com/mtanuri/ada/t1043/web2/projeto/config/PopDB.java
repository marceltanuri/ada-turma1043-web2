package br.com.mtanuri.ada.t1043.web2.projeto.config;

import br.com.mtanuri.ada.t1043.web2.projeto.entity.*;
import br.com.mtanuri.ada.t1043.web2.projeto.respository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PopDB implements CommandLineRunner {

    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private OrderItemRepository orderItemRepository;
    @Autowired
    private RoleRepository roleRepository;

    @Override
    public void run(String... args) throws Exception {

        Role role1 = new Role("ROLE_ADMIN");
        Role role2 = new Role("ROLE_USER");

        this.roleRepository.save(role1);
        this.roleRepository.save(role2);

        /*
        User user = new User("1", "2", "3", null);
        Product product = new Product("", "", 4.0);
        OrderItem orderItem = new OrderItem(product, 2);
        Order order = new Order(user);
        order.addOrderItem(orderItem);

        this.userRepository.save(user);
        this.productRepository.save(product);
        this.orderRepository.save(order);
        */
    }
}
