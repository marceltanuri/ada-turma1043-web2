package br.com.mtanuri.ada.t1043.web2.projeto.Products;

public interface  ProductMapperMapStruct  extends ProductMapper{
    ProductDTO toDTO(ProductModel model);
    ProductModel toEntity(ProductDTO dto);
}
