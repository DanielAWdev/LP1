package org.example.entity;

public class Tintura {
    private String marca;
    private String cor;
    private boolean semAmmonia;

    public Tintura(String marca, String cor, boolean semAmmonia) {
        this.marca = marca;
        this.cor = cor;
        this.semAmmonia = semAmmonia;
    }

    public void aplicar() { System.out.println("Tintura aplicada nos fios."); }
    public String getMarca() { return marca; }
    public String getCor() { return cor; }
    public boolean isSemAmmonia() { return semAmmonia; }
}