package src.ex02;

import src.DialogUtil;

public class MainEx02 {
    public static void executar() {
        Barco barco = new Barco();
        int op;

        do {
            op = DialogUtil.lerOpcaoMenu(
                    "Ex02 - Barco",
                    "1 - Entrar em movimento\n"
                            + "2 - Parar\n"
                            + "3 - Acelerar\n"
                            + "4 - Desacelerar\n"
                            + "5 - Descer ancora\n"
                            + "6 - Subir ancora\n"
                            + "0 - Voltar\n\n"
                            + "Opcao:"
            );

            switch (op) {
                case 1:
                    barco.entrarEmMovimento();
                    break;
                case 2:
                    barco.parar();
                    break;
                case 3:
                    Double acelerar = DialogUtil.lerDouble("Ex02 - Barco", "Quanto acelerar:");
                    if (acelerar != null) {
                        barco.acelerar(acelerar);
                    }
                    break;
                case 4:
                    Double desacelerar = DialogUtil.lerDouble("Ex02 - Barco", "Quanto desacelerar:");
                    if (desacelerar != null) {
                        barco.desacelerar(desacelerar);
                    }
                    break;
                case 5:
                    barco.descerAncora();
                    break;
                case 6:
                    barco.subirAncora();
                    break;
                case 0:
                    DialogUtil.mostrarInfo("Voltando...");
                    break;
                default:
                    DialogUtil.mostrarErro("Opcao invalida.");
            }

            DialogUtil.mostrarInfo("Estado atual: " + barco);
        } while (op != 0);
    }
}
