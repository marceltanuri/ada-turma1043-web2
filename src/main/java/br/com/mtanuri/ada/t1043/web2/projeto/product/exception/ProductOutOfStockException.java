package br.com.mtanuri.ada.t1043.web2.projeto.product.exception;

public class ProductOutOfStockException extends ProductException {
    public ProductOutOfStockException() {
        super("Product out of stock");
    }
}
