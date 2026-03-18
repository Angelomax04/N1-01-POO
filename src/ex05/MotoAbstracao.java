package src.ex05;

public class MotoAbstracao {
    String placa, denatran, chassi, cor;
    int cilindradas;
    double velocidadeMaxima;

    public String dadosDetran() {
        return "Placa=" + placa + ", DENATRAN=" + denatran + ", Chassi=" + chassi;
    }

    public String dadosComprador() {
        return "Cor=" + cor + ", Cilindradas=" + cilindradas + ", VelocidadeMaxima=" + velocidadeMaxima;
    }
}
