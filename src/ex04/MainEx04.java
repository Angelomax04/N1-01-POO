package src.ex04;

import src.DialogUtil;

public class MainEx04 {
    public static void executar() {
        Pessoa p = new Pessoa();
        DialogUtil.mostrarInfo("Ex04 Pessoa - preencha os dados.");

        String nome = DialogUtil.lerTexto("Ex04 - Pessoa", "Nome:");
        if (nome == null) return;
        p.nome = nome;

        String cpf = DialogUtil.lerTexto("Ex04 - Pessoa", "CPF:");
        if (cpf == null) return;
        p.cpf = cpf;

        String rg = DialogUtil.lerTexto("Ex04 - Pessoa", "RG:");
        if (rg == null) return;
        p.rg = rg;

        String sexo = DialogUtil.lerTexto("Ex04 - Pessoa", "Sexo:");
        if (sexo == null) return;
        p.sexo = sexo;

        Double altura = DialogUtil.lerDouble("Ex04 - Pessoa", "Altura:");
        if (altura == null) return;
        p.altura = altura;

        Double peso = DialogUtil.lerDouble("Ex04 - Pessoa", "Peso:");
        if (peso == null) return;
        p.peso = peso;

        Integer idade = DialogUtil.lerInt("Ex04 - Pessoa", "Idade:");
        if (idade == null) return;
        p.idade = idade;

        Double velMax = DialogUtil.lerDouble("Ex04 - Pessoa", "Velocidade maxima:");
        if (velMax == null) return;
        p.velMax = velMax;

        Integer numSapato = DialogUtil.lerInt("Ex04 - Pessoa", "Numero do sapato:");
        if (numSapato == null) return;
        p.numSapato = numSapato;

        Integer tamCamisa = DialogUtil.lerInt("Ex04 - Pessoa", "Tamanho da camisa:");
        if (tamCamisa == null) return;
        p.tamCamisa = tamCamisa;

        int op;
        do {
            op = DialogUtil.lerOpcaoMenu(
                    "Ex04 - Pessoa",
                    "Quem pergunta?\n"
                            + "1 - Sapataria\n"
                            + "2 - Treinador\n"
                            + "3 - Medico\n"
                            + "4 - Alfaiate\n"
                            + "5 - Faculdade\n"
                            + "0 - Voltar\n\n"
                            + "Opcao:"
            );

            switch (op) {
                case 1: DialogUtil.mostrarInfo(p.dadosSapataria()); break;
                case 2: DialogUtil.mostrarInfo(p.dadosTreinador()); break;
                case 3: DialogUtil.mostrarInfo(p.dadosMedico()); break;
                case 4: DialogUtil.mostrarInfo(p.dadosAlfaiate()); break;
                case 5: DialogUtil.mostrarInfo(p.dadosFaculdade()); break;
                case 0: break;
                default: DialogUtil.mostrarErro("Opcao invalida.");
            }
        } while (op != 0);
    }
}
