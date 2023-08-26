package br.com.mtanuri.ada.t1043.web2.projeto.dto;

import br.com.mtanuri.ada.t1043.web2.projeto.entity.Product;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class OrderItemDTO {
    private Long orderId;
    private String productId;
    private Integer quantity;
}
