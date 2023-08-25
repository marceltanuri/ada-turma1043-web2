package br.com.mtanuri.ada.t1043.web2.projeto.Products;

import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.util.List;


@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {
     final ProductRepository productRepository;

    @Override
    public List<ProductDTO> getAll() {
        return null;
    }

    @Override
    public ProductModel save(ProductModel productModel) {
        return this.productRepository.save(productModel);
    }

    @Override
    public ProductModel update(ProductModel productModel) {
        return null;
    }

    @Override
    public ProductModel findById(Long id) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
