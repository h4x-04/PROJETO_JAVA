package com.baozi.baozi_store.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.baozi.baozi_store.model.Cliente;
import com.baozi.baozi_store.repository.ClienteRepository;



@RestController
@RequestMapping("/clientes")

public class ClienteController {

    @Autowired
    private ClienteRepository repository;

    @GetMapping("/{id}")
    public Cliente buscarPorId (@PathVariable Long id){
        return repository.findById(id).orElse(null);
    }

    @GetMapping
    public List <Cliente> listarTodos(){
        return repository.findAll();
    }

    @PostMapping
    public Cliente criar (@RequestBody Cliente cliente){
        return repository.save(cliente);
    }

    @DeleteMapping("/{id}")
    public void deletar (@PathVariable Long id){
        repository.deleteById(id);
    }


}
    
    

      
    



