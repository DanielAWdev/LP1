import java.util.Scanner;

public class Exercicio6 {
    public void distancia() {
    }

    void main() {
        Scanner S = new Scanner(System.in);
        double Desconto = (double)0;
        System.out.print("digite a distância da viajem(em km): ");
        double Viajem = S.nextDouble();
        System.out.print("digite o preço da gasolina: ");
        double Preco = S.nextDouble();
        double Custo = Viajem / (double)12 * Preco;
        if (Viajem > (double)500) {
            Desconto = Custo - Custo * 0.05;
        }

        System.out.print("Custo total da viajem: " + Custo);
        if (Viajem > (double)500) {
            IO.println("Custo com desconto: " + Desconto);
        }

    }
}
