package br.com.mtanuri.ada.t1043.web2.projeto.Products;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

public class ProductDTO {
    @NotBlank
    @NotNull(message = "campo não pode ser nulo")
    private String name;
    private BigDecimal price;
    private BigDecimal discount;
    private Integer supply;
    private String description;
}
