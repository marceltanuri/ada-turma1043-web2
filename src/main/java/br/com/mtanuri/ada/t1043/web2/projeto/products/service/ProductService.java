package br.com.mtanuri.ada.t1043.web2.projeto.products.service;

import br.com.mtanuri.ada.t1043.web2.projeto.products.dto.ProductDTO;
import br.com.mtanuri.ada.t1043.web2.projeto.products.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ProductService {
        public Product save(ProductDTO productDTO);

        public List<ProductDTO> getallProducts();
}
