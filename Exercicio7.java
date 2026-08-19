import java.util.Scanner;

public class Exercicio7 {
    public void aluguel() {

         Scanner S = new Scanner(System.in);
        System.out.print("Digite a quantidade de dias: ");
        int Dias = S.nextInt();
        System.out.print("Digite a quilometragem: ");
        double Km = S.nextDouble();
        System.out.print("Digite o limite de quilômetros antes da cobrança adicional: ");
        double Limite = S.nextDouble();
        System.out.print("Digite o valor da diária: ");
        double Diaria = S.nextDouble();
        System.out.print("Digite o valor adicional por KM acima do limite: ");
        double Adicional = S.nextDouble();
        double Custo = (double)Dias * Diaria;
        if (Km > Limite) {
            Custo += (Km - Limite) * Adicional;
        }

        IO.println("Preço do aluguel: " + Custo);
    }
}
