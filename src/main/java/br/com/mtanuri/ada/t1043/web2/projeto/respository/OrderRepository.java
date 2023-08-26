package br.com.mtanuri.ada.t1043.web2.projeto.respository;

import br.com.mtanuri.ada.t1043.web2.projeto.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> { }
