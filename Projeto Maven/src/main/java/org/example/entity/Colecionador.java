package org.example.entity;

public class Colecionador {
    private String nome;
    private int quantidadePecas;
    private String paisOrigem;

    public Colecionador(String nome, int quantidadePecas, String paisOrigem) {
        this.nome = nome;
        this.quantidadePecas = quantidadePecas;
        this.paisOrigem = paisOrigem;
    }

    public void adquirirPeca() { System.out.println("Nova peça adicionada à coleção."); }
    public String getNome() { return nome; }
    public int getQuantidadePecas() { return quantidadePecas; }
    public String getPaisOrigem() { return paisOrigem; }
}