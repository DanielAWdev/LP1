package org.example.entity;

public class Capacete {
    private String marca;
    private String tamanho;
    private boolean comVisor;

    public Capacete(String marca, String tamanho, boolean comVisor) {
        this.marca = marca;
        this.tamanho = tamanho;
        this.comVisor = comVisor;
    }

    public void ajustar() { System.out.println("Capacete ajustado à cabeça."); }
    public String getMarca() { return marca; }
    public String getTamanho() { return tamanho; }
    public boolean isComVisor() { return comVisor; }
}