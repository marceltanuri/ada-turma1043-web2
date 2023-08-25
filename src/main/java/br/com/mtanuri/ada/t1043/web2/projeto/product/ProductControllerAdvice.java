package br.com.mtanuri.ada.t1043.web2.projeto.product;

import br.com.mtanuri.ada.t1043.web2.projeto.product.dto.ProductExceptionDto;
import br.com.mtanuri.ada.t1043.web2.projeto.product.exception.ProductException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice(basePackages = "br.com.mtanuri.ada.t1043.web2.projeto.product")
public class ProductControllerAdvice {
    @ExceptionHandler(value = ProductException.class)
    public ResponseEntity<ProductExceptionDto> handler(ProductException ex) {
        return new ResponseEntity<>(
                new ProductExceptionDto(
                        true,
                        ex.getMessage()
                ),
                HttpStatus.BAD_REQUEST
        );
    }
}
