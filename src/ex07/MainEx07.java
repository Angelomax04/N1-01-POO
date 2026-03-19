package src.ex07;

import src.DialogUtil;

public class MainEx07 {
    public static void executar() {
        Empregado e = new Empregado();
        int op;

        do {
            op = DialogUtil.lerOpcaoMenu(
                    "Exercicio 07 - Empregado",
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
                    String nome = DialogUtil.lerTexto("Ex07 - Empregado", "Nome:");
                    if (nome == null) break;
                    e.setNome(nome);

                    String cpf = DialogUtil.lerTexto("Ex07 - Empregado", "CPF:");
                    if (cpf == null) break;
                    e.setCpf(cpf);

                    String cargo = DialogUtil.lerTexto("Ex07 - Empregado", "Cargo:");
                    if (cargo == null) break;
                    e.setCargo(cargo);

                    Double salario = DialogUtil.lerDouble("Ex07 - Empregado", "Salario:");
                    if (salario == null) break;
                    e.setSalario(salario);

                    Boolean ativo = DialogUtil.lerBool("Ex07 - Empregado", "Empregado ativo?");
                    if (ativo == null) break;
                    e.setAtivo(ativo);
                    break;
                case 2:
                    DialogUtil.mostrarInfo(
                            "Detalhes do Empregado:\n"
                                    + "Nome: " + e.getNome() + "\n"
                                    + "CPF: " + e.getCpf() + "\n"
                                    + "Cargo: " + e.getCargo() + "\n"
                                    + "Salario: " + e.getSalario() + "\n"
                                    + "Ativo: " + e.isAtivo()
                    );
                    break;
                case 4:
                    e.excluir();
                    break;
                case 0:
                    break;
                default:
                    DialogUtil.mostrarErro("Opcao invalida.");
            }

            DialogUtil.mostrarInfo("Estado atual: " + e);
        } while (op != 0);
    }
}
