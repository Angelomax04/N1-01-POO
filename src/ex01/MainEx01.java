package src.ex01;

import src.DialogUtil;

public class MainEx01 {
    public static void executar() {
        Aviao aviao = new Aviao();
        int opcao;

        do {
            opcao = DialogUtil.lerOpcaoMenu(
                    "Exercicio 01 - Aviao",
                    "1 - Decolar\n"
                            + "2 - Aterrissar\n"
                            + "3 - Subir\n"
                            + "4 - Descer\n"
                            + "0 - Voltar ao menu principal\n\n"
                            + "Escolha:"
            );

            switch (opcao) {
                case 1:
                    aviao.decolar();
                    break;
                case 2:
                    aviao.aterrissar();
                    break;
                case 3:
                    Integer subir = DialogUtil.lerInt("Exercicio 01 - Aviao", "Quantos metros deseja subir?");
                    if (subir != null) {
                        aviao.subir(subir);
                    }
                    break;
                case 4:
                    Integer descer = DialogUtil.lerInt("Exercicio 01 - Aviao", "Quantos metros deseja descer?");
                    if (descer != null) {
                        aviao.descer(descer);
                    }
                    break;
                case 0:
                    DialogUtil.mostrarInfo("Voltando ao menu principal...");
                    break;
                default:
                    DialogUtil.mostrarErro("Opcao invalida.");
            }

            DialogUtil.mostrarInfo("Estado atual: " + aviao);
        } while (opcao != 0);
    }
}
