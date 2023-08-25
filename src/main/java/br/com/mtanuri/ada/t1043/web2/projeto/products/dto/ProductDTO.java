package br.com.mtanuri.ada.t1043.web2.projeto.products.dto;

import br.com.mtanuri.ada.t1043.web2.projeto.products.model.Product;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductDTO {

    private String name;
    private String description;
    private Integer quantityInStock;
    private BigDecimal price;
    private LocalDateTime createdAt;
}
