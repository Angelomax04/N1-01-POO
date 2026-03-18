package src;

import java.util.Scanner;

import src.ex01.MainEx01;
import src.ex02.MainEx02;
import src.ex03.MainEx03;
import src.ex04.MainEx04;
import src.ex05.MainEx05;
import src.ex06.MainEx06;
import src.ex07.MainEx07;
import src.ex08.MainEx08;
import src.ex09.MainEx09;
import src.ex10.MainEx10;

public class MainPrincipal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n=== MENU PRINCIPAL ===");
            System.out.println("1 - Exercicio 01 (Aviao)");
            System.out.println("2 - Exercicio 02 (Barco)");
            System.out.println("3 - Exercicio 03 (Televisao)");
            System.out.println("4 - Exercicio 04 (Pessoa - Abstracao)");
            System.out.println("5 - Exercicio 05 (Moto - Abstracao)");
            System.out.println("6 - Exercicio 06 (Automovel - Abstracao)");
            System.out.println("7 - Exercicio 07 (Empregado - Encapsulamento)");
            System.out.println("8 - Exercicio 08 (Moto - Encapsulamento)");
            System.out.println("9 - Exercicio 09 (Automovel - Encapsulamento)");
            System.out.println("10 - Exercicio 10 (Aviao - Encapsulamento)");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = lerInt(sc);

            switch (opcao) {
                case 1:
                    MainEx01.executar(sc);
                    break;
                case 2:
                    MainEx02.executar(sc);
                    break;
                case 3:
                    MainEx03.executar(sc);
                    break;
                case 4:
                    MainEx04.executar(sc);
                    break;
                case 5:
                    MainEx05.executar(sc);
                    break;
                case 6:
                    MainEx06.executar(sc);
                    break;
                case 7:
                    MainEx07.executar(sc);
                    break;
                case 8:
                    MainEx08.executar(sc);
                    break;
                case 9:
                    MainEx09.executar(sc);
                    break;
                case 10:
                    MainEx10.executar(sc);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opcao invalida.");
            }
        } while (opcao != 0);

        sc.close();
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

