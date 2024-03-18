package com.lab2.stockapi.Produto;

import java.time.LocalDateTime;

import org.springframework.cglib.core.Local;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Produto {
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (nullable = false, unique = true)
    private String nome;

    @Column (nullable = true)
    private String descricao;

    @Column (nullable = false)
    private Double preco;

    @Column (nullable = true)
    private Integer quantidade;

    @Column (nullable = false)
    private LocalDateTime criadoEm;
    
    public Produto(String nome, String descricao, Double preco, Integer quantidade) {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.quantidade = quantidade;
        this.criadoEm = LocalDateTime.now();
    }

    public Produto() {
    }

    public Produto (Long Id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public Double getPreco() {
        return preco;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public LocalDateTime getCriadoEm() {
        return LocalDateTime.now();
    }

}

