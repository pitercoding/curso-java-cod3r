package br.com.cod3r.exerciciossb.controllers;

import br.com.cod3r.exerciciossb.model.entities.Produto;
import br.com.cod3r.exerciciossb.model.repositories.ProdutoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

    @Autowired //Cria um objeto dentro de produtoRepository
    private ProdutoRepository produtoRepository;

    //Antes: era um @PostMapping
    //Agora: PUT e POST juntos com @RequestMapping
    @RequestMapping(method = {RequestMethod.POST, RequestMethod.PUT})
    public @ResponseBody Produto salvarProduto(@Valid Produto produto) {
        produtoRepository.save(produto);
        return produto;
    }

    @GetMapping
    public Iterable<Produto> obterProdutos() {
        return produtoRepository.findAll();
    }

    //    @GetMapping(path = "/pagina/{numeroPagina}/{qtdePagina}")
//    public Iterable<Produto> obterProdutosPorPagina(
//            @PathVariable int numeroPagina, @PathVariable int qtdePagina) {
//        if (qtdePagina >= 5) qtdePagina = 5;
//        Pageable page = PageRequest.of(numeroPagina, 3);
//        return produtoRepository.findAll(page);
//    }

    @GetMapping(path = "/{id}")
    public Optional<Produto> obterProdutoPorId(@PathVariable int id) {
        return produtoRepository.findById(id);
    }

    //Esse método é igual ao novoProduto.
    // É possível removê-lo se usar RequestMapping + method={RequestMethod.POST, RequestMethod.PUT}
//    @PutMapping
//    public Produto alterarProduto(@Valid Produto produto) {
//        produtoRepository.save(produto);
//        return produto;
//    }

    @DeleteMapping(path = "/{id}")
    public void excluirProduto(@PathVariable int id) {
        produtoRepository.deleteById(id);
    }
}
