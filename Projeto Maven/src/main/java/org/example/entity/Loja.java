package org.example.entity;

public class Loja {
    private String nome;
    private String endereco;
    private String gerente;

    public Loja(String nome, String endereco, String gerente) {
        this.nome = nome;
        this.endereco = endereco;
        this.gerente = gerente;
    }

    public void abrirPortas() { System.out.println("A loja abriu."); }
    public String getNome() { return nome; }
    public String getEndereco() { return endereco; }
    public String getGerente() { return gerente; }
}