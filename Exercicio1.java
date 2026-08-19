import java.util.Scanner;

public class Exercicio1 {
    public static void multiplo () {
        Scanner entrada = new Scanner(System.in);

        int numero1, numero2;

        System.out.print("Digite o primeiro numero: ");
        numero1 = entrada.nextInt();

        System.out.print("Digite o segundo numero: ");
        numero2 = entrada.nextInt();

        if (numero2 != 0 && numero1 % numero2 == 0) {
            System.out.print("E multiplo");
        } else {
            System.out.print("Nao e multiplo");
        }
    }
}
