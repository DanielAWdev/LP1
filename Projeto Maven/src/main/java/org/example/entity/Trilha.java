package org.example.entity;

public class Trilha {
    private String nome;
    private double extensaoKm;
    private String dificuldade;

    public Trilha(String nome, double extensaoKm, String dificuldade) {
        this.nome = nome;
        this.extensaoKm = extensaoKm;
        this.dificuldade = dificuldade;
    }

    public void explorar() { System.out.println("Explorando a trilha " + nome); }
    public String getNome() { return nome; }
    public double getExtensaoKm() { return extensaoKm; }
    public String getDificuldade() { return dificuldade; }
}