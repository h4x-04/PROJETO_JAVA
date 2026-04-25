package com.baozi.baozi_store.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.baozi.baozi_store.model.Produto;
import com.baozi.baozi_store.repository.ProdutoRepository;



@RestController
@RequestMapping("/produtos")

public class ProdutoController {

    @Autowired
    private ProdutoRepository repository;


    @GetMapping
    public List <Produto> listarTodos(){
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Produto buscarPorId (@PathVariable Long id){
        return repository.findById(id).orElse(null);
    }
    
    @PostMapping
    public Produto criar (@RequestBody Produto produto){
        return repository.save(produto);
    }

    @DeleteMapping("/{id}")
    public void deletar (@PathVariable Long id){
        repository.deleteById(id);
    }


}
    
    

      
    




