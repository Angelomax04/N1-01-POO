package src.ex06;

public class AutomovelAbstracao {
    String placa;
    int anoFabricacao;
    String numeroDenatran;
    double kmRodados;
    int anoModelo;
    String cor;

    public String dadosDetran() {
        return "Placa=" + placa + ", AnoFabricacao=" + anoFabricacao + ", NumeroDENATRAN=" + numeroDenatran;
    }

    public String dadosComprador() {
        return "KmRodados=" + kmRodados + ", AnoModelo=" + anoModelo + ", Cor=" + cor;
    }
}
