package br.com.mtanuri.ada.t1043.web2.projeto.orders.repository;

import br.com.mtanuri.ada.t1043.web2.projeto.orders.model.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderItemRepository extends JpaRepository<String, OrderItem> {
}
