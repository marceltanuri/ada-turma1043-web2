package br.com.mtanuri.ada.t1043.web2.projeto.product.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ProductExceptionDto {
    private boolean error;
    private String message;
}
