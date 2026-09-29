package com.example.projeto3.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tab_produto")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class ProdutoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String lote;

    @Column(nullable = false)
    private int quantidade;

    @Column(nullable = false)
    private double preco;

    public String getLote() {
        return lote;
    }

    public void setId(Long id) {
        this.id = id;
    }
}


