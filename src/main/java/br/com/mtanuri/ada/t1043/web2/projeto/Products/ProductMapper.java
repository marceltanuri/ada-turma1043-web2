package br.com.mtanuri.ada.t1043.web2.projeto.Products;

public interface ProductMapper {
    ProductDTO toDto(ProductModel model);
    ProductModel toEntity(ProductDTO dto);
}
