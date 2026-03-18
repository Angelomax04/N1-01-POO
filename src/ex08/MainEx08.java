package src.ex08;

import java.util.Scanner;

public class MainEx08 {
    public static void executar(Scanner sc) {
        MotoEncapsulada m = new MotoEncapsulada();
        int op;

        do {
            System.out.println("\n--- Exercicio 08 - Moto Encapsulada ---");
            System.out.println("1 - Cadastre");
            System.out.println("2 - Liste");
            System.out.println("3 - Altere");
            System.out.println("4 - Exclua");
            System.out.println("0 - Voltar");
            System.out.print("Escolha: ");
            op = lerInt(sc);

            switch (op) {
                case 1:
                case 3:
                    System.out.print("Placa: "); m.setPlaca(sc.nextLine());
                    System.out.print("Cor: "); m.setCor(sc.nextLine());
                    System.out.print("Cilindradas: "); m.setCilindradas(lerInt(sc));
                    System.out.print("Velocidade maxima: "); m.setVelocidadeMaxima(lerDouble(sc));
                    System.out.print("Ligada (true/false): "); m.setLigada(lerBool(sc));
                    break;
                case 2:
                    break;
                case 4:
                    m.excluir();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opcao invalida.");
            }

            System.out.println("Estado atual: " + m);
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

    private static boolean lerBool(Scanner sc) {
        while (!sc.hasNextBoolean()) { System.out.print("Digite true ou false: "); sc.next(); }
        boolean v = sc.nextBoolean(); sc.nextLine(); return v;
    }
}
