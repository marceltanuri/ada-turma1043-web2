package br.com.mtanuri.ada.t1043.web2.projeto.service;

import br.com.mtanuri.ada.t1043.web2.projeto.dto.ProductDTO;
import br.com.mtanuri.ada.t1043.web2.projeto.entity.Product;
import br.com.mtanuri.ada.t1043.web2.projeto.respository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    @Override
    public Product insertProduct(ProductDTO productDTO) {
        Product product = new Product(productDTO.getName(), productDTO.getDescription(), productDTO.getPrice());
        return this.productRepository.save(product);
    }

    @Override
    public Product getProductById(String productId) {
        return this.productRepository.findById(productId).get();
    }
}
