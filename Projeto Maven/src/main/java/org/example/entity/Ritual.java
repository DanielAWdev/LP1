package org.example.entity;

public class Ritual {
    private String nome;
    private String objetivo;
    private String horario;

    public Ritual(String nome, String objetivo, String horario) {
        this.nome = nome;
        this.objetivo = objetivo;
        this.horario = horario;
    }

    public void iniciar() { System.out.println("O ritual começou."); }
    public String getNome() { return nome; }
    public String getObjetivo() { return objetivo; }
    public String getHorario() { return horario; }
}