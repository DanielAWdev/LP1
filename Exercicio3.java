    import java.util.Scanner;

    public class Exercicio3 {
        public static void caixa() {
            Scanner entrada = new Scanner(System.in);

            double arroz, feijao, oleo, acucar, cafe;
            double macarrao, farinha, fuba, molho, sal;

            int qtdArroz, qtdFeijao, qtdOleo, qtdAcucar, qtdCafe;
            int qtdMacarrao, qtdFarinha, qtdFuba, qtdMolho, qtdSal;

            System.out.println("Caixa");

            System.out.print("Preco do arroz: R$ ");
            arroz = entrada.nextDouble();
            System.out.print("Quantidade: ");
            qtdArroz = entrada.nextInt();

            System.out.print("Preco do feijao: R$ ");
            feijao = entrada.nextDouble();
            System.out.print("Quantidade: ");
            qtdFeijao = entrada.nextInt();

            System.out.print("Preco do oleo: R$ ");
            oleo = entrada.nextDouble();
            System.out.print("Quantidade: ");
            qtdOleo = entrada.nextInt();

            System.out.print("Preco do acucar: R$ ");
            acucar = entrada.nextDouble();
            System.out.print("Quantidade: ");
            qtdAcucar = entrada.nextInt();

            System.out.print("Preco do cafe: R$ ");
            cafe = entrada.nextDouble();
            System.out.print("Quantidade: ");
            qtdCafe = entrada.nextInt();

            System.out.print("Preco do macarrao: R$ ");
            macarrao = entrada.nextDouble();
            System.out.print("Quantidade: ");
            qtdMacarrao = entrada.nextInt();

            System.out.print("Preco da farinha: R$ ");
            farinha = entrada.nextDouble();
            System.out.print("Quantidade: ");
            qtdFarinha = entrada.nextInt();

            System.out.print("Preco do fuba: R$ ");
            fuba = entrada.nextDouble();
            System.out.print("Quantidade: ");
            qtdFuba = entrada.nextInt();

            System.out.print("Preco do molho de tomate: R$ ");
            molho = entrada.nextDouble();
            System.out.print("Quantidade: ");
            qtdMolho = entrada.nextInt();

            System.out.print("Preco do sal: R$ ");
            sal = entrada.nextDouble();
            System.out.print("Quantidade: ");
            qtdSal = entrada.nextInt();

            double parcialArroz = arroz * qtdArroz;
            double parcialFeijao = feijao * qtdFeijao;
            double parcialOleo = oleo * qtdOleo;
            double parcialAcucar = acucar * qtdAcucar;
            double parcialCafe = cafe * qtdCafe;
            double parcialMacarrao = macarrao * qtdMacarrao;
            double parcialFarinha = farinha * qtdFarinha;
            double parcialFuba = fuba * qtdFuba;
            double parcialMolho = molho * qtdMolho;
            double parcialSal = sal * qtdSal;

            double total = parcialArroz + parcialFeijao + parcialOleo
                    + parcialAcucar + parcialCafe + parcialMacarrao
                    + parcialFarinha + parcialFuba + parcialMolho + parcialSal;

            double desconto = 0;

            if (total > 100) {
                desconto = total * 0.10;
            }

            double valorFinal = total - desconto;

            System.out.println("\nLISTAGEM");

            System.out.printf("Arroz       %d x R$ %.2f = R$ %.2f%n",
                    qtdArroz, arroz, parcialArroz);

            System.out.printf("Feijao      %d x R$ %.2f = R$ %.2f%n",
                    qtdFeijao, feijao, parcialFeijao);

            System.out.printf("Oleo        %d x R$ %.2f = R$ %.2f%n",
                    qtdOleo, oleo, parcialOleo);

            System.out.printf("Acucar      %d x R$ %.2f = R$ %.2f%n",
                    qtdAcucar, acucar, parcialAcucar);

            System.out.printf("Cafe        %d x R$ %.2f = R$ %.2f%n",
                    qtdCafe, cafe, parcialCafe);

            System.out.printf("Macarrao    %d x R$ %.2f = R$ %.2f%n",
                    qtdMacarrao, macarrao, parcialMacarrao);

            System.out.printf("Farinha     %d x R$ %.2f = R$ %.2f%n",
                    qtdFarinha, farinha, parcialFarinha);

            System.out.printf("Fuba        %d x R$ %.2f = R$ %.2f%n",
                    qtdFuba, fuba, parcialFuba);

            System.out.printf("Molho       %d x R$ %.2f = R$ %.2f%n",
                    qtdMolho, molho, parcialMolho);

            System.out.printf("Sal         %d x R$ %.2f = R$ %.2f%n",
                    qtdSal, sal, parcialSal);

            System.out.printf("\nTotal da compra: R$ %.2f%n", total);
            System.out.printf("Desconto: R$ %.2f%n", desconto);
            System.out.printf("VALOR FINAL: R$ %.2f%n", valorFinal);

            entrada.close();
        }
    }
