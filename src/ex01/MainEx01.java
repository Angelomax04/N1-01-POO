package src.ex01;

import java.util.Scanner;

public class MainEx01 {
    public static void executar(Scanner sc) {
        Aviao aviao = new Aviao();
        int opcao;

        do {
            System.out.println("\n--- Exercicio 01 - Aviao ---");
            System.out.println("1 - Decolar");
            System.out.println("2 - Aterrissar");
            System.out.println("3 - Subir");
            System.out.println("4 - Descer");
            System.out.println("0 - Voltar ao menu principal");
            System.out.print("Escolha: ");
            opcao = lerInt(sc);

            switch (opcao) {
                case 1:
                    aviao.decolar();
                    break;
                case 2:
                    aviao.aterrissar();
                    break;
                case 3:
                    System.out.print("Quantos metros deseja subir? ");
                    aviao.subir(lerInt(sc));
                    break;
                case 4:
                    System.out.print("Quantos metros deseja descer? ");
                    aviao.descer(lerInt(sc));
                    break;
                case 0:
                    System.out.println("Voltando ao menu principal...");
                    break;
                default:
                    System.out.println("Opcao invalida.");
            }

            System.out.println("Estado atual: " + aviao);
        } while (opcao != 0);
    }

    private static int lerInt(Scanner sc) {
        while (!sc.hasNextInt()) {
            System.out.print("Digite um numero valido: ");
            sc.next();
        }
        int v = sc.nextInt();
        sc.nextLine();
        return v;
    }
}
