package br.com.mtanuri.ada.t1043.web2.projeto.produto;

import java.util.List;

public interface ProdutoService {
    List<Produto> obterTodos();
    Produto obterUm(Long id);
    Produto salvarProduto(ProdutoDTO produtoDTO);
    void deletarProduto(Long id);
    Produto updateProduto(Long id, ProdutoDTO produtoDTO);
}
