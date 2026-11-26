package org.example.entity;

public class Acessorio {
    private String nome;
    private String material;
    private double preco;

    public Acessorio(String nome, String material, double preco) {
        this.nome = nome;
        this.material = material;
        this.preco = preco;
    }

    public void usar() { System.out.println("Acessório vestitdo."); }
    public String getNome() { return nome; }
    public String getMaterial() { return material; }
    public double getPreco() { return preco; }
}