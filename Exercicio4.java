import java.util.Scanner;

public class Exercicio4 {
        public static void temperatura () {

            Scanner entrada = new Scanner(System.in);

            int quantidade;
            double temperatura;
            double soma = 0;

            System.out.print("Quantas temperaturas deseja informar? ");
            quantidade = entrada.nextInt();

            for (int i = 1; i <= quantidade; i++) {

                System.out.print("Digite a temperatura " + i + ": ");
                temperatura = entrada.nextDouble();

                soma = soma + temperatura;

                if (temperatura < 18) {
                    System.out.println("Frio");
                } else {
                    System.out.println("Temperatura agradavel");
                }
            }

            double media = soma / quantidade;

            System.out.printf("%nTemperatura media: %.2f °C%n", media);

            if (media < 18) {
                System.out.println("faz frio em Sao Jose dos Campos.");
            } else {
                System.out.println("a temperatura e agradavel em Sao Jose dos Campos.");
            }

            entrada.close();
        }
    }

