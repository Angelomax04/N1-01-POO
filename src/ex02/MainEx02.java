package src.ex02;

import java.util.Scanner;

public class MainEx02 {
    public static void executar(Scanner sc) {
        Barco barco = new Barco();
        int op;

        do {
            System.out.println("\n--- Ex02 Barco ---");
            System.out.println("1 - Entrar em movimento");
            System.out.println("2 - Parar");
            System.out.println("3 - Acelerar");
            System.out.println("4 - Desacelerar");
            System.out.println("5 - Descer ancora");
            System.out.println("6 - Subir ancora");
            System.out.println("0 - Voltar");
            System.out.print("Opcao: ");
            op = lerInt(sc);

            switch (op) {
                case 1:
                    barco.entrarEmMovimento();
                    break;
                case 2:
                    barco.parar();
                    break;
                case 3:
                    System.out.print("Quanto acelerar: ");
                    barco.acelerar(lerDouble(sc));
                    break;
                case 4:
                    System.out.print("Quanto desacelerar: ");
                    barco.desacelerar(lerDouble(sc));
                    break;
                case 5:
                    barco.descerAncora();
                    break;
                case 6:
                    barco.subirAncora();
                    break;
                case 0:
                    System.out.println("Voltando...");
                    break;
                default:
                    System.out.println("Opcao invalida.");
            }

            System.out.println("Estado atual: " + barco);
        } while (op != 0);
    }

    private static int lerInt(Scanner sc) {
        while (!sc.hasNextInt()) {
            System.out.print("Numero invalido: ");
            sc.next();
        }
        int v = sc.nextInt();
        sc.nextLine();
        return v;
    }

    private static double lerDouble(Scanner sc) {
        while (!sc.hasNextDouble()) {
            System.out.print("Numero invalido: ");
            sc.next();
        }
        double v = sc.nextDouble();
        sc.nextLine();
        return v;
    }
}
