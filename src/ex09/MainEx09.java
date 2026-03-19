package src.ex09;

import src.DialogUtil;

public class MainEx09 {
    public static void executar() {
        AutomovelEncapsulado a = new AutomovelEncapsulado();
        int op;

        do {
            op = DialogUtil.lerOpcaoMenu(
                    "Exercicio 09 - Automovel Encapsulado",
                    "1 - Cadastre\n"
                            + "2 - Liste\n"
                            + "3 - Altere\n"
                            + "4 - Exclua\n"
                            + "0 - Voltar\n\n"
                            + "Escolha:"
            );

            switch (op) {
                case 1:
                case 3:
                    String placa = DialogUtil.lerTexto("Ex09 - Automovel Encapsulado", "Placa:");
                    if (placa == null) break;
                    a.setPlaca(placa);

                    String cor = DialogUtil.lerTexto("Ex09 - Automovel Encapsulado", "Cor:");
                    if (cor == null) break;
                    a.setCor(cor);

                    Integer ano = DialogUtil.lerInt("Ex09 - Automovel Encapsulado", "Ano:");
                    if (ano == null) break;
                    a.setAno(ano);

                    Double km = DialogUtil.lerDouble("Ex09 - Automovel Encapsulado", "KM:");
                    if (km == null) break;
                    a.setKm(km);

                    Boolean ligado = DialogUtil.lerBool("Ex09 - Automovel Encapsulado", "Automovel ligado?");
                    if (ligado == null) break;
                    a.setLigado(ligado);
                    break;
                case 2:
                    break;
                case 4:
                    a.excluir();
                    break;
                case 0:
                    break;
                default:
                    DialogUtil.mostrarErro("Opcao invalida.");
            }

            DialogUtil.mostrarInfo("Estado atual: " + a);
        } while (op != 0);
    }
}
