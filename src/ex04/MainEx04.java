package src.ex04;

import java.util.Scanner;

public class MainEx04 {
    public static void executar(Scanner sc) {
        Pessoa p = new Pessoa();
        System.out.println("\n--- Ex04 Pessoa (preencha os dados) ---");
        System.out.print("Nome: "); p.nome = sc.nextLine();
        System.out.print("CPF: "); p.cpf = sc.nextLine();
        System.out.print("RG: "); p.rg = sc.nextLine();
        System.out.print("Sexo: "); p.sexo = sc.nextLine();
        System.out.print("Altura: "); p.altura = lerDouble(sc);
        System.out.print("Peso: "); p.peso = lerDouble(sc);
        System.out.print("Idade: "); p.idade = lerInt(sc);
        System.out.print("Velocidade maxima: "); p.velMax = lerDouble(sc);
        System.out.print("Numero do sapato: "); p.numSapato = lerInt(sc);
        System.out.print("Tamanho da camisa: "); p.tamCamisa = lerInt(sc);

        int op;
        do {
            System.out.println("\nQuem pergunta?");
            System.out.println("1 Sapataria");
            System.out.println("2 Treinador");
            System.out.println("3 Medico");
            System.out.println("4 Alfaiate");
            System.out.println("5 Faculdade");
            System.out.println("0 Voltar");
            System.out.print("Opcao: ");
            op = lerInt(sc);

            switch (op) {
                case 1: System.out.println(p.dadosSapataria()); break;
                case 2: System.out.println(p.dadosTreinador()); break;
                case 3: System.out.println(p.dadosMedico()); break;
                case 4: System.out.println(p.dadosAlfaiate()); break;
                case 5: System.out.println(p.dadosFaculdade()); break;
                case 0: break;
                default: System.out.println("Opcao invalida.");
            }
        } while (op != 0);
    }

    private static int lerInt(Scanner sc) { while (!sc.hasNextInt()) sc.next(); int v = sc.nextInt(); sc.nextLine(); return v; }
    private static double lerDouble(Scanner sc) { while (!sc.hasNextDouble()) sc.next(); double v = sc.nextDouble(); sc.nextLine(); return v; }
}
