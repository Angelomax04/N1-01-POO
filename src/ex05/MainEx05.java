package src.ex05;

import src.DialogUtil;

public class MainEx05 {
    public static void executar() {
        MotoAbstracao m = new MotoAbstracao();
        DialogUtil.mostrarInfo("Ex05 Moto - preencha os dados.");

        String placa = DialogUtil.lerTexto("Ex05 - Moto", "Placa:");
        if (placa == null) return;
        m.placa = placa;

        String denatran = DialogUtil.lerTexto("Ex05 - Moto", "DENATRAN:");
        if (denatran == null) return;
        m.denatran = denatran;

        String chassi = DialogUtil.lerTexto("Ex05 - Moto", "Chassi:");
        if (chassi == null) return;
        m.chassi = chassi;

        String cor = DialogUtil.lerTexto("Ex05 - Moto", "Cor:");
        if (cor == null) return;
        m.cor = cor;

        Integer cilindradas = DialogUtil.lerInt("Ex05 - Moto", "Cilindradas:");
        if (cilindradas == null) return;
        m.cilindradas = cilindradas;

        Double velMax = DialogUtil.lerDouble("Ex05 - Moto", "Velocidade maxima:");
        if (velMax == null) return;
        m.velocidadeMaxima = velMax;

        int op;
        do {
            op = DialogUtil.lerOpcaoMenu(
                    "Ex05 - Moto",
                    "Quem pergunta?\n"
                            + "1 - Detran\n"
                            + "2 - Comprador\n"
                            + "0 - Voltar\n\n"
                            + "Opcao:"
            );

            switch (op) {
                case 1: DialogUtil.mostrarInfo(m.dadosDetran()); break;
                case 2: DialogUtil.mostrarInfo(m.dadosComprador()); break;
                case 0: break;
                default: DialogUtil.mostrarErro("Opcao invalida.");
            }
        } while (op != 0);
    }
}
