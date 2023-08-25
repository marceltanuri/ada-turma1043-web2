package br.com.mtanuri.ada.t1043.web2.projeto.service;

import br.com.mtanuri.ada.t1043.web2.projeto.dto.ProductDTO;
import br.com.mtanuri.ada.t1043.web2.projeto.entity.Product;

public interface ProductService {

    Product insertProduct(ProductDTO productDTO);
}
