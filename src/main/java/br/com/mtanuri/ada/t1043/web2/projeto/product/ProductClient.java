package br.com.mtanuri.ada.t1043.web2.projeto.product;

import br.com.mtanuri.ada.t1043.web2.projeto.product.dto.ProductListDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "productdummyjson", url = "https://dummyjson.com/products/")
public interface ProductClient {
    @GetMapping("/search")
    ProductListDto getProductList(@RequestParam("q") String query);


}
