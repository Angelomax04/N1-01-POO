package src.ex06;

import java.util.Scanner;

public class MainEx06 {
    public static void executar(Scanner sc) {
        AutomovelAbstracao a = new AutomovelAbstracao();

        System.out.println("\n--- Exercicio 06 - Automovel (cadastro inicial) ---");
        System.out.print("Placa: "); a.placa = sc.nextLine();
        System.out.print("Ano fabricacao: "); a.anoFabricacao = lerInt(sc);
        System.out.print("Numero DENATRAN: "); a.numeroDenatran = sc.nextLine();
        System.out.print("KM rodados: "); a.kmRodados = lerDouble(sc);
        System.out.print("Ano modelo: "); a.anoModelo = lerInt(sc);
        System.out.print("Cor: "); a.cor = sc.nextLine();

        int op;
        do {
            System.out.println("\nQuem pergunta?");
            System.out.println("1 - Detran");
            System.out.println("2 - Comprador");
            System.out.println("0 - Voltar");
            System.out.print("Escolha: ");
            op = lerInt(sc);

            switch (op) {
                case 1: System.out.println(a.dadosDetran()); break;
                case 2: System.out.println(a.dadosComprador()); break;
                case 0: break;
                default: System.out.println("Opcao invalida.");
            }
        } while (op != 0);
    }

    private static int lerInt(Scanner sc) {
        while (!sc.hasNextInt()) { System.out.print("Numero invalido: "); sc.next(); }
        int v = sc.nextInt(); sc.nextLine(); return v;
    }

    private static double lerDouble(Scanner sc) {
        while (!sc.hasNextDouble()) { System.out.print("Numero invalido: "); sc.next(); }
        double v = sc.nextDouble(); sc.nextLine(); return v;
    }
}
