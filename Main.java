import java.util.Scanner;

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
    Escolha = S.nextInt();

    switch (Escolha){
        case 1:
            EX1.multiplo();
            break;
        case 2:
            EX2.senha();
            break;
        case 3:
            EX3.caixa();
            break;
        case 4:
            EX4.temperatura();
            break;
        case 5:
            EX5.camelos();
            break;
        case 6:
            EX6.distancia();
            break;
            case 7:
                EX7.aluguel();
                break;
    }
}
