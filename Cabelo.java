public class Cabelo {

    private String cor;
    private double comprimento;
    private String estilo;
    private String tipo;
    private String textura;

    public Cabelo(String cor, double comprimento, String estilo,
                  String tipo, String textura) {
        this.cor = cor;
        this.comprimento = comprimento;
        this.estilo = estilo;
        this.tipo = tipo;
        this.textura = textura;
    }

    public void cortar(double centimetros) {
        comprimento -= centimetros;

        if (comprimento < 0) {
            comprimento = 0;
        }

        System.out.println("Cabelo cortado.");
    }

    public void pentear() {
        System.out.println(
                "O cabelo foi penteado no estilo " + estilo + "."
        );
    }

    public void pintar(String novaCor) {
        cor = novaCor;
        System.out.println("O cabelo agora é " + cor + ".");
    }

    public String getCor() {
        return cor;
    }

    public double getComprimento() {
        return comprimento;
    }

    public String getEstilo() {
        return estilo;
    }

    public String getTipo() {
        return tipo;
    }

    public String getTextura() {
        return textura;
    }
}