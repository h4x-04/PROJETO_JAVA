package com.baozi.baozi_store.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.baozi.baozi_store.model.Pedido;
import com.baozi.baozi_store.repository.PedidoRepository;



@RestController
@RequestMapping("/pedidos")

public class PedidoController {

    @Autowired
    private PedidoRepository repository;


    @GetMapping
    public List <Pedido> listarTodos(){
        return repository.findAll();
    }

     @GetMapping("/{id}")
    public Pedido buscarPorId (@PathVariable Long id){
        return repository.findById(id).orElse(null);
    }
    
    @PostMapping
    public Pedido criar (@RequestBody Pedido pedido){
        return repository.save(pedido);
    }

    @DeleteMapping("/{id}")
    public void deletar (@PathVariable Long id){
        repository.deleteById(id);
    }


}
    
    

      
    



