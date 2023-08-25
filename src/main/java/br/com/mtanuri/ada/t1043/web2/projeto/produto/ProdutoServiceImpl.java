package br.com.mtanuri.ada.t1043.web2.projeto.produto;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoServiceImpl implements ProdutoService {
    private final ProdutoRepository produtoRepository;

    ProdutoServiceImpl(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    @Override
    public List<Produto> obterTodos() {
        return produtoRepository.findAll();
    }

    @Override
    public Produto obterUm(Long id) {
        return produtoRepository.findById(id).orElseThrow(() -> new EntityNotFoundException());
    }

    @Override
    public Produto salvarProduto(ProdutoDTO produtoDTO) {
        Produto novoProduto = new Produto();
        novoProduto.setDescricao(produtoDTO.descricao());
        novoProduto.setValor(produtoDTO.valor());
        novoProduto.setQuantidadeEstoque(produtoDTO.quantidadeEstoque());
        return produtoRepository.save(novoProduto);
    }

    @Override
    public void deletarProduto(Long id) {
        produtoRepository.deleteById(id);
    }

    @Override
    public Produto updateProduto(Long id, ProdutoDTO produtoDTO) {
        Produto produto = obterUm(id);
        produto.setDescricao(produtoDTO.descricao());
        produto.setValor(produtoDTO.valor());
        produto.setQuantidadeEstoque(produtoDTO.quantidadeEstoque());
        return produtoRepository.save(produto);
    }
}
