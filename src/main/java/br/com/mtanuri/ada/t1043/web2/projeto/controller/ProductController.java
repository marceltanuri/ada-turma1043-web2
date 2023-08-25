package br.com.mtanuri.ada.t1043.web2.projeto.controller;

import br.com.mtanuri.ada.t1043.web2.projeto.dto.ProductDTO;
import br.com.mtanuri.ada.t1043.web2.projeto.entity.Product;
import br.com.mtanuri.ada.t1043.web2.projeto.service.ProductServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/products")
@AllArgsConstructor
public class ProductController {

    private final ProductServiceImpl productService;

    @PostMapping
    public ResponseEntity<Product> insertProduct(@RequestBody ProductDTO productDTO) {
        Product product = this.productService.insertProduct(productDTO);
        return new ResponseEntity<>(product, HttpStatus.CREATED);
    }
}
