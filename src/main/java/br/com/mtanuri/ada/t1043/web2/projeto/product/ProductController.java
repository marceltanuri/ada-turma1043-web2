package br.com.mtanuri.ada.t1043.web2.projeto.product;

import br.com.mtanuri.ada.t1043.web2.projeto.product.dto.ProductExceptionDto;
import br.com.mtanuri.ada.t1043.web2.projeto.product.service.ProductService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/products")
@Tag(name = "Products", description = "Manage the products")
public class ProductController {
    private final ProductService productService;

    @GetMapping
    @Operation(summary = "Get all products", description = "Return all products saved")
    public List<Product> getProducts() {
        return this.productService.findAll();
    }

    @GetMapping(value = "/{id}")
    @Operation(summary = "Get product by Id", description = "Return one product by Id")
    public Optional<Product> getProductById(@PathVariable Long id) {
        Product product = new Product();
        product.setId(id);
        return this.productService.find(product);
    }

//    @GetMapping(value = "/test")
//    @Operation(summary = "Test", description = "Test")
//    @ApiResponse(
//            responseCode = "200",
//            description = "OK"
//    )
//    @ApiResponse(
//            responseCode = "400",
//            description = "Bad Request",
//            content = @Content(schema = @Schema(implementation = ProductExceptionDto.class))
//    )
//    public void test() {
//        var searchProduct = new Product();
//        searchProduct.setId(40L);
//        var product = this.productService.find(searchProduct).orElseThrow(RuntimeException::new);
//
//        this.productService.reduceStock(product);
//    }
}
