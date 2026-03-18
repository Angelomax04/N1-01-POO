package src.ex04;

public class Pessoa {
    String cpf, rg, nome, sexo;
    double altura, peso, velMax;
    int idade, numSapato, tamCamisa;

    public String dadosSapataria() { return "Nome=" + nome + ", NumSapato=" + numSapato; }
    public String dadosTreinador() { return "Nome=" + nome + ", Altura=" + altura + ", Peso=" + peso + ", VelMax=" + velMax; }
    public String dadosMedico() { return "Nome=" + nome + ", CPF=" + cpf + ", RG=" + rg + ", Altura=" + altura + ", Peso=" + peso + ", Idade=" + idade + ", Sexo=" + sexo; }
    public String dadosAlfaiate() { return "Nome=" + nome + ", TamCamisa=" + tamCamisa; }
    public String dadosFaculdade() { return "Nome=" + nome + ", CPF=" + cpf + ", RG=" + rg + ", Idade=" + idade; }
}
