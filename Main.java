import java.util.Scanner;
//1-Verificação de Múltiplo
//Entrada: Dois números inteiros.
//Processamento: Verificar se o primeiro é múltiplo do segundo.
//Saída: Resultado da verificação.


public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
int senha, senha2;
System.out.println("SENHA:");
senha = 1234;
senha2 = entrada.nextInt();

if (senha == senha2){
    System.out.print("correto");
}
else {
    System.out.print("senha errada");
}
}
