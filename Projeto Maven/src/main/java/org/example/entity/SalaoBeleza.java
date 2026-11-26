package org.example.entity;

public class SalaoBeleza {
    private String nome;
    private String cabeleireiroResponsavel;
    private double faturamento;

    public SalaoBeleza(String nome, String cabeleireiroResponsavel, double faturamento) {
        this.nome = nome;
        this.cabeleireiroResponsavel = cabeleireiroResponsavel;
        this.faturamento = faturamento;
    }

    public void atenderCliente() { System.out.println("Cliente sendo atendido no salão."); }
    public String getNome() { return nome; }
    public String getCabeleireiroResponsavel() { return cabeleireiroResponsavel; }
    public double getFaturamento() { return faturamento; }
}