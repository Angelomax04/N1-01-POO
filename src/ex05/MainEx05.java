package src.ex05;

import java.util.Scanner;

public class MainEx05 {
    public static void executar(Scanner sc) {
        MotoAbstracao m = new MotoAbstracao();
        System.out.println("\n--- Ex05 Moto (preencha os dados) ---");
        System.out.print("Placa: "); m.placa = sc.nextLine();
        System.out.print("DENATRAN: "); m.denatran = sc.nextLine();
        System.out.print("Chassi: "); m.chassi = sc.nextLine();
        System.out.print("Cor: "); m.cor = sc.nextLine();
        System.out.print("Cilindradas: "); m.cilindradas = lerInt(sc);
        System.out.print("Velocidade maxima: "); m.velocidadeMaxima = lerDouble(sc);

        int op;
        do {
            System.out.println("\nQuem pergunta?");
            System.out.println("1 Detran");
            System.out.println("2 Comprador");
            System.out.println("0 Voltar");
            System.out.print("Opcao: ");
            op = lerInt(sc);

            switch (op) {
                case 1: System.out.println(m.dadosDetran()); break;
                case 2: System.out.println(m.dadosComprador()); break;
                case 0: break;
                default: System.out.println("Opcao invalida.");
            }
        } while (op != 0);
    }

    private static int lerInt(Scanner sc) { while (!sc.hasNextInt()) sc.next(); int v = sc.nextInt(); sc.nextLine(); return v; }
    private static double lerDouble(Scanner sc) { while (!sc.hasNextDouble()) sc.next(); double v = sc.nextDouble(); sc.nextLine(); return v; }
}
