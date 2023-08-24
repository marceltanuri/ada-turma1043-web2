package br.com.mtanuri.ada.t1043.web2.projeto.product.service.impl;


import br.com.mtanuri.ada.t1043.web2.projeto.product.Product;
import br.com.mtanuri.ada.t1043.web2.projeto.product.ProductRepository;
import br.com.mtanuri.ada.t1043.web2.projeto.product.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;

    @Override
    public List<Product> findAll() {
        return this.productRepository.findAll();
    }

    @Override
    public Product save(Product product) {
        return this.productRepository.save(product);
    }

    @Override
    public List<Product> save(List<Product> products) {
        return this.productRepository.saveAll(products);
    }

    @Override
    public void deleteAll() {
        this.productRepository.deleteAll();
    }
}
