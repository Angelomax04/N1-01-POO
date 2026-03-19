package src.ex10;

import src.DialogUtil;

public class MainEx10 {
    public static void executar() {
        AviaoEncapsulado a = new AviaoEncapsulado();
        int op;

        do {
            op = DialogUtil.lerOpcaoMenu(
                    "Exercicio 10 - Aviao Encapsulado",
                    "1 - Cadastre\n"
                            + "2 - Liste\n"
                            + "3 - Altere\n"
                            + "4 - Exclua\n"
                            + "5 - Decolar\n"
                            + "6 - Aterrissar\n"
                            + "7 - Subir\n"
                            + "8 - Descer\n"
                            + "0 - Voltar\n\n"
                            + "Escolha:"
            );

            switch (op) {
                case 1:
                case 3:
                    String modelo = DialogUtil.lerTexto("Ex10 - Aviao Encapsulado", "Modelo:");
                    if (modelo == null) break;
                    a.setModelo(modelo);

                    Integer capacidade = DialogUtil.lerInt("Ex10 - Aviao Encapsulado", "Capacidade:");
                    if (capacidade == null) break;
                    a.setCapacidade(capacidade);

                    Integer altitude = DialogUtil.lerInt("Ex10 - Aviao Encapsulado", "Altitude:");
                    if (altitude == null) break;
                    a.setAltitude(altitude);

                    Boolean voando = DialogUtil.lerBool("Ex10 - Aviao Encapsulado", "Aviao voando?");
                    if (voando == null) break;
                    a.setVoando(voando);
                    break;
                case 2:
                    break;
                case 4:
                    a.excluir();
                    break;
                case 5:
                    a.decolar();
                    break;
                case 6:
                    a.aterrissar();
                    break;
                case 7:
                    Integer subir = DialogUtil.lerInt("Ex10 - Aviao Encapsulado", "Quantos metros deseja subir?");
                    if (subir != null) {
                        a.subir(subir);
                    }
                    break;
                case 8:
                    Integer descer = DialogUtil.lerInt("Ex10 - Aviao Encapsulado", "Quantos metros deseja descer?");
                    if (descer != null) {
                        a.descer(descer);
                    }
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
