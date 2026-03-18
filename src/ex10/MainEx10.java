package src.ex10;

import java.util.Scanner;

public class MainEx10 {
    public static void executar(Scanner sc) {
        AviaoEncapsulado a = new AviaoEncapsulado();
        int op;

        do {
            System.out.println("\n--- Exercicio 10 - Aviao Encapsulado ---");
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
                    System.out.print("Modelo: "); a.setModelo(sc.nextLine());
                    System.out.print("Capacidade: "); a.setCapacidade(lerInt(sc));
                    System.out.print("Altitude: "); a.setAltitude(lerInt(sc));
                    System.out.print("Voando (true/false): "); a.setVoando(lerBool(sc));
                    break;
                case 2:
                    break;
                case 4:
                    a.excluir();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opcao invalida.");
            }

            System.out.println("Estado atual: " + a);
        } while (op != 0);
    }

    private static int lerInt(Scanner sc) {
        while (!sc.hasNextInt()) { System.out.print("Numero invalido: "); sc.next(); }
        int v = sc.nextInt(); sc.nextLine(); return v;
    }

    private static boolean lerBool(Scanner sc) {
        while (!sc.hasNextBoolean()) { System.out.print("Digite true ou false: "); sc.next(); }
        boolean v = sc.nextBoolean(); sc.nextLine(); return v;
    }
}
