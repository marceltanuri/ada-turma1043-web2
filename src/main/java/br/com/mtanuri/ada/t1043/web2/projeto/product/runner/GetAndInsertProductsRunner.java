package br.com.mtanuri.ada.t1043.web2.projeto.product.runner;

import br.com.mtanuri.ada.t1043.web2.projeto.product.ProductClient;
import br.com.mtanuri.ada.t1043.web2.projeto.product.ProductRepository;
import br.com.mtanuri.ada.t1043.web2.projeto.product.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class GetAndInsertProductsRunner implements CommandLineRunner {
    private final ProductRepository productRepository;
    private final ProductClient productClient;

    @Override
    public void run(String... args) throws Exception {
        if(this.productRepository.count() > 1) return;

        var products = this.productClient
                .getProductList("Phone")
                .getProducts();

        this.productRepository.saveAll(products);
    }
}
