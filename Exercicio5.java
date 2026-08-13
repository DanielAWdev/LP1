import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int camelos;
        int parte1, parte2, parte3;

        System.out.print("Digite a quantidade de camelos: ");
        camelos = entrada.nextInt();

        System.out.print("Digite a parcela do primeiro irmao: ");
        parte1 = entrada.nextInt();

        System.out.print("Digite a parcela do segundo irmao: ");
        parte2 = entrada.nextInt();

        System.out.print("Digite a parcela do terceiro irmao: ");
        parte3 = entrada.nextInt();

        int camelosComAdicao = camelos + 1;

        int primeiro = camelosComAdicao / parte1;
        int segundo = camelosComAdicao / parte2;
        int terceiro = camelosComAdicao / parte3;

        int totalDistribuido = primeiro + segundo + terceiro;
        int sobra = camelosComAdicao - totalDistribuido;

        System.out.println("\ndivisao dos camelos");

        System.out.println("Primeiro irmao: " + primeiro + " camelos");
        System.out.println("Segundo irmao: " + segundo + " camelos");
        System.out.println("Terceiro irmao: " + terceiro + " camelos");

        System.out.println("Total distribuido: " + totalDistribuido);
        System.out.println("Sobra: " + sobra + " camelo(s)");

        entrada.close();
    }
}