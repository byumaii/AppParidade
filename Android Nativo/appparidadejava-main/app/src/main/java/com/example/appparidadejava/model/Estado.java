package com.example.appparidadejava.model;

import java.io.Serializable;

public class Estado implements Serializable {
    private int id;
    private String sigla;
    private String nome;
    private Regiao regiao;

    // Getters
    public int getId() { return id; }
    public String getSigla() { return sigla; }
    public String getNome() { return nome; }
    public Regiao getRegiao() { return regiao; }
}