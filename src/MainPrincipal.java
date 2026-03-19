package src;

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
        int opcao;

        do {
            opcao = DialogUtil.lerOpcaoMenu(
                    "Menu Principal",
                    "=== MENU PRINCIPAL ===\n"
                            + "1 - Exercicio 01 (Aviao)\n"
                            + "2 - Exercicio 02 (Barco)\n"
                            + "3 - Exercicio 03 (Televisao)\n"
                            + "4 - Exercicio 04 (Pessoa - Abstracao)\n"
                            + "5 - Exercicio 05 (Moto - Abstracao)\n"
                            + "6 - Exercicio 06 (Automovel - Abstracao)\n"
                            + "7 - Exercicio 07 (Empregado - Encapsulamento)\n"
                            + "8 - Exercicio 08 (Moto - Encapsulamento)\n"
                            + "9 - Exercicio 09 (Automovel - Encapsulamento)\n"
                            + "10 - Exercicio 10 (Aviao - Encapsulamento)\n"
                            + "0 - Sair\n\n"
                            + "Escolha:"
            );

            switch (opcao) {
                case 1:
                    MainEx01.executar();
                    break;
                case 2:
                    MainEx02.executar();
                    break;
                case 3:
                    MainEx03.executar();
                    break;
                case 4:
                    MainEx04.executar();
                    break;
                case 5:
                    MainEx05.executar();
                    break;
                case 6:
                    MainEx06.executar();
                    break;
                case 7:
                    MainEx07.executar();
                    break;
                case 8:
                    MainEx08.executar();
                    break;
                case 9:
                    MainEx09.executar();
                    break;
                case 10:
                    MainEx10.executar();
                    break;
                case 0:
                    DialogUtil.mostrarInfo("Saindo...");
                    break;
                default:
                    DialogUtil.mostrarErro("Opcao invalida.");
            }
        } while (opcao != 0);
    }
}

