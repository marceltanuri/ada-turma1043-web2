package br.com.mtanuri.ada.t1043.web2.projeto.product.dto;

import br.com.mtanuri.ada.t1043.web2.projeto.product.Product;
import lombok.Data;

import java.util.List;

@Data
public class ProductListDto {
    private List<Product> products;
    private int total;
    private int skip;
    private int limit;
}
