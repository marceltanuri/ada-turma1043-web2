package br.com.mtanuri.ada.t1043.web2.projeto.orders.repository;

import br.com.mtanuri.ada.t1043.web2.projeto.orders.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<String, Order> {
}
