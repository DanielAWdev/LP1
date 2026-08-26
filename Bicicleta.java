public class Bicicleta {

    private String marca;
    private int marcha;
    private double velocidade;
    private String tipo;
    private double peso;

    public Bicicleta(String marca, int marcha, double velocidade,
                     String tipo, double peso) {
        this.marca = marca;
        this.marcha = marcha;
        this.velocidade = velocidade;
        this.tipo = tipo;
        this.peso = peso;
    }

    public void pedalar() {
        velocidade += 5;
        System.out.println("A bicicleta está andando.");
    }

    public void frear() {
        velocidade = 0;
        System.out.println("A bicicleta parou.");
    }

    public void trocarMarcha(int novaMarcha) {
        marcha = novaMarcha;
        System.out.println("Marcha alterada para: " + marcha);
    }

    public String getMarca() {
        return marca;
    }

    public int getMarcha() {
        return marcha;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public String getTipo() {
        return tipo;
    }

    public double getPeso() {
        return peso;
    }
}