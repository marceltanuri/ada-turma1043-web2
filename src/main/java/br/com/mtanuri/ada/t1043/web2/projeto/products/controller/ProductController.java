package br.com.mtanuri.ada.t1043.web2.projeto.products.controller;

import br.com.mtanuri.ada.t1043.web2.projeto.products.service.ProductServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController("/products")
@RequiredArgsConstructor
public class ProductController {
    private final ProductServiceImpl productService;
}
