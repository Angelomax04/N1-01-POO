package src.ex08;

import src.DialogUtil;

public class MainEx08 {
    public static void executar() {
        MotoEncapsulada m = new MotoEncapsulada();
        int op;

        do {
            op = DialogUtil.lerOpcaoMenu(
                    "Exercicio 08 - Moto Encapsulada",
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
                    String placa = DialogUtil.lerTexto("Ex08 - Moto Encapsulada", "Placa:");
                    if (placa == null) break;
                    m.setPlaca(placa);

                    String cor = DialogUtil.lerTexto("Ex08 - Moto Encapsulada", "Cor:");
                    if (cor == null) break;
                    m.setCor(cor);

                    Integer cilindradas = DialogUtil.lerInt("Ex08 - Moto Encapsulada", "Cilindradas:");
                    if (cilindradas == null) break;
                    m.setCilindradas(cilindradas);

                    Double velMax = DialogUtil.lerDouble("Ex08 - Moto Encapsulada", "Velocidade maxima:");
                    if (velMax == null) break;
                    m.setVelocidadeMaxima(velMax);

                    Boolean ligada = DialogUtil.lerBool("Ex08 - Moto Encapsulada", "Moto ligada?");
                    if (ligada == null) break;
                    m.setLigada(ligada);
                    break;
                case 2:
                    break;
                case 4:
                    m.excluir();
                    break;
                case 0:
                    break;
                default:
                    DialogUtil.mostrarErro("Opcao invalida.");
            }

            DialogUtil.mostrarInfo("Estado atual: " + m);
        } while (op != 0);
    }
}
