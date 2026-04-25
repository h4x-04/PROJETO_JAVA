package com.baozi.baozi_store.model;

import org.springframework.format.annotation.DateTimeFormat;
import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;



@Entity
@Table(name="cliente")

public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message="O NOME DO(A) CLIENTE É OBRIGATÓRIO")
    @Size(min=2,max=60,message="O NOME DEVE CONTER NO MINIMO {min} CARACTERERE")
    @Column(name="nome", nullable=false, unique=true, length=60)
    private String nome;


    @NotNull(message="CLIENTE DESDE É OBRIGATÓRIO")
    @Column(name="cliente_desde", nullable=false)
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate clienteDesde;

    public Long getId(){
        return id;
    }

    public void setId (Long id){
        this.id=id;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome=nome;
    }

    public LocalDate getDataCadastro(){
        return clienteDesde;
    }
    public void setClienteDesde(LocalDate clienteDesde){
        this.clienteDesde = clienteDesde;
    }


}
