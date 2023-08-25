package br.com.mtanuri.ada.t1043.web2.projeto.Products;

import org.springframework.stereotype.Service;

import java.util.List;

@Service

public interface ProductService {
    List<ProductDTO> getAll();

    ProductModel save(ProductModel productModel);

    ProductModel update(ProductModel productModel);

    ProductModel findById(Long id);

    void delete(Long id);

}

