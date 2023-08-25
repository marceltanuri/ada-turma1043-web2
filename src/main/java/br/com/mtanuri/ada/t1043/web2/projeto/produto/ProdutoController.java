package br.com.mtanuri.ada.t1043.web2.projeto.produto;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

@RestController
@RequestMapping("produtos")
public class ProdutoController {

    private final ProdutoService produtoService;
    public ProdutoController(ProdutoService produtoService){
        this.produtoService = produtoService;
    }


    @GetMapping
    public ResponseEntity<List<Produto>> obterTodos(){
        List<Produto> produtos = produtoService.obterTodos();
        return ResponseEntity.ok(produtos);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Produto> obterUm(@PathVariable String id) {
        Produto produto = produtoService.obterUm(Long.parseLong(id));
        return ResponseEntity.ok(produto);
    }

    @PostMapping
    public ResponseEntity<Produto> salvarProduto(@RequestBody ProdutoDTO produto, UriComponentsBuilder uriBuilder) {
        Produto novoProduto = produtoService.salvarProduto(produto);
        var uri = uriBuilder.path("/produtos/{id}").buildAndExpand(novoProduto.getId()).toUri();
        return ResponseEntity.created(uri).body(novoProduto);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Produto> updateProduto(@PathVariable String id, @RequestBody ProdutoDTO produto){
        Produto updatedProduto = produtoService.updateProduto(Long.parseLong(id), produto);
        return ResponseEntity.ok(updatedProduto);
    }

    @DeleteMapping("{id}")
    public ResponseEntity deleteProduto(@PathVariable String id){
        produtoService.deletarProduto(Long.parseLong(id));
        return ResponseEntity.noContent().build();
    }
}
