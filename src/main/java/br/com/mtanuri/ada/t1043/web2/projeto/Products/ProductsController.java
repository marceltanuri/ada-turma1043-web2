package br.com.mtanuri.ada.t1043.web2.projeto.Products;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/products")
@RequiredArgsConstructor

public class ProductsController {
    final ProductServiceImpl productServiceImpl;


    @GetMapping

    @PostMapping
    public ProductModel saveProduct(@RequestBody ProductDTO product){
        return this.productServiceImpl.save(product);

    }

}
