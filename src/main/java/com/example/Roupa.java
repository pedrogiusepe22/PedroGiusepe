package com.example;

public class Roupa {
    private String nome;
    private String tamanho;
    private int quantidadeEmEstoque;
    private double preco;
    private String foto; 
    public Roupa() {
    }

    public Roupa(String nome, String tamanho, int quantidadeEmEstoque, double preco, String foto) {
        this.nome = nome;
        this.tamanho = tamanho;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
        this.preco = preco;
        this.foto = foto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getFoto() {
        return foto;
    }
    }
