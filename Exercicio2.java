import java.util.Scanner;

public class Exercicio2 {
    public static void senha () {
        Scanner entrada = new Scanner(System.in);
        int senha, senha2;
        System.out.println("SENHA:");
        senha = 1234;
        senha2 = entrada.nextInt();

        if (senha == senha2) {
            System.out.print("correto");
        } else {
            System.out.print("senha errada");
        }
    }

    void main() {
        int Escolha;
        Exercicio1 EX1 = new Exercicio1();
        Exercicio2 EX2 = new Exercicio2();
        Exercicio3 EX3 = new Exercicio3();
        Exercicio4 EX4 = new Exercicio4();
        Exercicio5 EX5 = new Exercicio5();
        Exercicio6 EX6 = new Exercicio6();
        Exercicio7 EX7 = new Exercicio7();
        Scanner S = new Scanner(System.in);

        IO.println("Qual você deseja executar?\n" +
                "1-Verificação de Múltiplo\n" +
                "2-Sistema de Login Simplificado\n" +
                "3-Compra com desconto\n" +
                "4-Temperatura\n" +
                "5-Os trinta e cinco camelos\n" +
                "6-Calculadora de viagem\n" +
                "7-Aluguel de carro");
    }
}



