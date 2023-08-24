package br.com.mtanuri.ada.t1043.web2.projeto.products.repository;

import br.com.mtanuri.ada.t1043.web2.projeto.products.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<String, Product> {
}
