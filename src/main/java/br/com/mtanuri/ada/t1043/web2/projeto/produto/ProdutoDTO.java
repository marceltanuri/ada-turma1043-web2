package br.com.mtanuri.ada.t1043.web2.projeto.produto;

import java.math.BigDecimal;

public record ProdutoDTO (
    String descricao,
    BigDecimal valor,
    Integer quantidadeEstoque
){}
