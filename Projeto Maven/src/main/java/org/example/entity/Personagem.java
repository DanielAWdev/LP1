package org.example.entity;

public class Personagem {
    private String nome;
    private String anime;
    private int poder;

    public Personagem(String nome, String anime, int poder) {
        this.nome = nome;
        this.anime = anime;
        this.poder = poder;
    }

    public void lutar() { System.out.println(nome + " entrou em combate!"); }
    public String getNome() { return nome; }
    public String getAnime() { return anime; }
    public int getPoder() { return poder; }
}