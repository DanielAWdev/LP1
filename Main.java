public class Main {

    public static void main(String[] args) {


        // ROUPA


        Roupa roupa1 = new Roupa(
                "Camisa",
                "M",
                80.00,
                "Azul",
                "Dorinho's"
        );

        System.out.println("ROUPA");

        System.out.println("Tipo: " + roupa1.getTipo());
        System.out.println("Tamanho: " + roupa1.getTamanho());
        System.out.println("Preço: R$ " + roupa1.getPreco());
        System.out.println("Cor: " + roupa1.getCor());
        System.out.println("Marca: " + roupa1.getMarca());

        roupa1.vestir();
        roupa1.aplicarDesconto(10);
        roupa1.retirar();



        // BICICLETA


        Bicicleta bicicleta1 = new Bicicleta(
                "Caloi",
                3,
                10.0,
                "Mountain Bike",
                14.5
        );

        System.out.println("\nBICICLETA");

        System.out.println("Marca: " + bicicleta1.getMarca());
        System.out.println("Marcha: " + bicicleta1.getMarcha());
        System.out.println(
                "Velocidade: " + bicicleta1.getVelocidade()
        );
        System.out.println("Tipo: " + bicicleta1.getTipo());
        System.out.println("Peso: " + bicicleta1.getPeso() + " kg");

        bicicleta1.pedalar();

        System.out.println(
                "Velocidade após pedalar: "
                        + bicicleta1.getVelocidade()
        );

        bicicleta1.trocarMarcha(5);
        bicicleta1.frear();


        // CABELO


        Cabelo cabelo1 = new Cabelo(
                "Preto",
                30.0,
                "Repicado",
                "Ondulado",
                "Fino"
        );

        System.out.println("\nCABELO");

        System.out.println("Cor: " + cabelo1.getCor());

        System.out.println(
                "Comprimento: "
                        + cabelo1.getComprimento()
                        + " cm"
        );

        System.out.println(
                "Estilo: "
                        + cabelo1.getEstilo()
        );

        System.out.println(
                "Tipo: "
                        + cabelo1.getTipo()
        );

        System.out.println(
                "Textura: "
                        + cabelo1.getTextura()
        );

        cabelo1.pentear();
        cabelo1.cortar(5);
        cabelo1.pintar("Castanho");



        // MÁSCARA

        Mascara mascara1 = new Mascara();

        System.out.println("\nMÁSCARA");

        mascara1.mascara(
                "Marrom",
                20.0,
                "Sul Africano",
                "Madeira",
                "Cerimonial"
        );

        System.out.println(
                "Cor: " + mascara1.getCor()
        );

        System.out.println(
                "Comprimento: "
                        + mascara1.getComprimento()
                        + " cm"
        );

        System.out.println(
                "Estilo: "
                        + mascara1.getEstilo()
        );

        System.out.println(
                "Material: "
                        + mascara1.getMaterial()
        );

        System.out.println(
                "Uso: "
                        + mascara1.getUso()
        );

        mascara1.pintar("Azul");
        mascara1.origem("Sul Africano");
        mascara1.tamanho(10);
    }
}