package com.controle.estoque.model;

import java.util.UUID;

import jakarta.persistence.*;

@Entity
@Table(name= "TB PRODUTOS")
public class Produto {

    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private UUID id;

   

    private String nome;

    private Integer valor;

    public UUID getId() {
        return id;
    }
    
    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    
    
}
