package br.com.mtanuri.ada.t1043.web2.projeto.product.service;

import br.com.mtanuri.ada.t1043.web2.projeto.product.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAll();

    Product save(Product product);

    List<Product> save(List<Product> product);

    void deleteAll();
}
