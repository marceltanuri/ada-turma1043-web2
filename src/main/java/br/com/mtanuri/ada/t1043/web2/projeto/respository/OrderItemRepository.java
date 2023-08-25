package br.com.mtanuri.ada.t1043.web2.projeto.respository;

import br.com.mtanuri.ada.t1043.web2.projeto.entity.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> { }
