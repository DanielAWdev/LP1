package org.example.entity;

public class Calcado {
    private String modelo;
    private int numeracao;
    private double preco;
    private String cor;

    public Calcado(String modelo, int numeracao, double preco, String cor) {
        this.modelo = modelo;
        this.numeracao = numeracao;
        this.preco = preco;
        this.cor = cor;
    }

    public void calcar() { System.out.println("Calçado colocado."); }
    public String getModelo() { return modelo; }
    public int getNumeracao() { return numeracao; }
    public double getPreco() { return preco; }
    public String getCor() { return cor; }
}