package src.ex07;

import java.util.Scanner;

public class MainEx07 {
    public static void executar(Scanner sc) {
        Empregado e = new Empregado();
        int op;

        do {
            System.out.println("\n--- Exercicio 07 - Empregado ---");
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
                    System.out.print("Nome: "); e.setNome(sc.nextLine());
                    System.out.print("CPF: "); e.setCpf(sc.nextLine());
                    System.out.print("Cargo: "); e.setCargo(sc.nextLine());
                    System.out.print("Salario: "); e.setSalario(lerDouble(sc));
                    System.out.print("Ativo (true/false): "); e.setAtivo(lerBool(sc));
                    break;
                case 2:
                    System.out.println("\nDetalhes do Empregado:");
                    System.out.println("Nome: " + e.getNome());
                    System.out.println("CPF: " + e.getCpf());
                    System.out.println("Cargo: " + e.getCargo());
                    System.out.println("Salario: " + e.getSalario());
                    System.out.println("Ativo: " + e.isAtivo());
                    break;
                case 4:
                    e.excluir();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opcao invalida.");
            }

            System.out.println("Estado atual: " + e);
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
