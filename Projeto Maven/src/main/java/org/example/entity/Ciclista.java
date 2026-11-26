package org.example.entity;

public class Ciclista {
    private String nome;
    private int idade;
    private double quilometragemTotal;

    public Ciclista(String nome, int idade, double quilometragemTotal) {
        this.nome = nome;
        this.idade = idade;
        this.quilometragemTotal = quilometragemTotal;
    }

    public void pedalar() { System.out.println(nome + " está pedalando."); }
    public String getNome() { return nome; }
    public int getIdade() { return idade; }
    public double getQuilometragemTotal() { return quilometragemTotal; }
}