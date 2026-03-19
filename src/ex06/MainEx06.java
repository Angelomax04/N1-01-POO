package src.ex06;

import src.DialogUtil;

public class MainEx06 {
    public static void executar() {
        AutomovelAbstracao a = new AutomovelAbstracao();

        DialogUtil.mostrarInfo("Exercicio 06 - Automovel (cadastro inicial)");

        String placa = DialogUtil.lerTexto("Ex06 - Automovel", "Placa:");
        if (placa == null) return;
        a.placa = placa;

        Integer anoFabricacao = DialogUtil.lerInt("Ex06 - Automovel", "Ano fabricacao:");
        if (anoFabricacao == null) return;
        a.anoFabricacao = anoFabricacao;

        String denatran = DialogUtil.lerTexto("Ex06 - Automovel", "Numero DENATRAN:");
        if (denatran == null) return;
        a.numeroDenatran = denatran;

        Double kmRodados = DialogUtil.lerDouble("Ex06 - Automovel", "KM rodados:");
        if (kmRodados == null) return;
        a.kmRodados = kmRodados;

        Integer anoModelo = DialogUtil.lerInt("Ex06 - Automovel", "Ano modelo:");
        if (anoModelo == null) return;
        a.anoModelo = anoModelo;

        String cor = DialogUtil.lerTexto("Ex06 - Automovel", "Cor:");
        if (cor == null) return;
        a.cor = cor;

        int op;
        do {
            op = DialogUtil.lerOpcaoMenu(
                    "Ex06 - Automovel",
                    "Quem pergunta?\n"
                            + "1 - Detran\n"
                            + "2 - Comprador\n"
                            + "0 - Voltar\n\n"
                            + "Escolha:"
            );

            switch (op) {
                case 1: DialogUtil.mostrarInfo(a.dadosDetran()); break;
                case 2: DialogUtil.mostrarInfo(a.dadosComprador()); break;
                case 0: break;
                default: DialogUtil.mostrarErro("Opcao invalida.");
            }
        } while (op != 0);
    }
}
