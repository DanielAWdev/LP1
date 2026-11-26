package org.example.entity;

public class Mascara {

    private String cor;
    private double comprimento;
    private String estilo;
    private String material;
    private String uso;

    public void mascara(String cor, double comprimento, String estilo,
                        String material, String uso) {

        this.cor = cor;
        this.comprimento = comprimento;
        this.estilo = estilo;
        this.material = material;
        this.uso = uso;
    }

    public void pintar(String cor) {
        this.cor = cor;
        System.out.println("Cor " + cor);
    }

    public void origem(String estilo) {
        this.estilo = estilo;
        System.out.println("Origem: " + estilo);
    }

    public void tamanho(int comprimento) {
        this.comprimento = comprimento;
        System.out.println(comprimento + " cm");
    }

    public double getComprimento() {
        return comprimento;
    }

    public String getCor() {
        return cor;
    }

    public String getEstilo() {
        return estilo;
    }

    public String getMaterial() {
        return material;
    }

    public String getUso() {
        return uso;
    }
}

