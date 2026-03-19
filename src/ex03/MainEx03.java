package src.ex03;

import src.DialogUtil;

public class MainEx03 {
    public static void executar() {
        Televisao tv = new Televisao();
        int op;
        do {
            op = DialogUtil.lerOpcaoMenu(
                    "Ex03 - Televisao",
                    "1 - Ligar\n"
                            + "2 - Desligar\n"
                            + "3 - Aumentar canal\n"
                            + "4 - Diminuir canal\n"
                            + "5 - Aumentar volume\n"
                            + "6 - Diminuir volume\n"
                            + "0 - Voltar\n\n"
                            + "Opcao:"
            );

            switch (op) {
                case 1: tv.ligar(); break;
                case 2: tv.desligar(); break;
                case 3: tv.aumentarCanal(); break;
                case 4: tv.diminuirCanal(); break;
                case 5: tv.aumentarVolume(); break;
                case 6: tv.diminuirVolume(); break;
                case 0: break;
                default: DialogUtil.mostrarErro("Opcao invalida.");
            }
            DialogUtil.mostrarInfo(String.valueOf(tv));
        } while (op != 0);
    }
}
