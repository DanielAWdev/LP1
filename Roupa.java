public class Roupa {

    private String tipo;
    private String tamanho;
    private double preco;
    private String cor;
    private String marca;

    public Roupa(String tipo, String tamanho, double preco,
                 String cor, String marca) {
        this.tipo = tipo;
        this.tamanho = tamanho;
        this.preco = preco;
        this.cor = cor;
        this.marca = marca;
    }

    public void vestir() {
        System.out.println("A roupa foi vestida.");
    }

    public void retirar() {
        System.out.println("A roupa foi retirada.");
    }

    public void aplicarDesconto(double percentual) {
        preco = preco - (preco * percentual / 100);
        System.out.println("Novo preço: R$ " + preco);
    }

    public String getTipo() {
        return tipo;
    }

    public String getTamanho() {
        return tamanho;
    }

    public double getPreco() {
        return preco;
    }

    public String getCor() {
        return cor;
    }

    public String getMarca() {
        return marca;
    }
}
