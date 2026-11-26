package org.example.entity;

public class Tribo {
    private String nome;
    private String regiao;
    private int populacao;

    public Tribo(String nome, String regiao, int populacao) {
        this.nome = nome;
        this.regiao = regiao;
        this.populacao = populacao;
    }

    public void contarHistoria() { System.out.println("Contando história da tribo."); }
    public String getNome() { return nome; }
    public String getRegiao() { return regiao; }
    public int getPopulacao() { return populacao; }
}