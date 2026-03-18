package src.ex08;

public class MotoEncapsulada {
    private String placa;
    private String cor;
    private int cilindradas;
    private double velocidadeMaxima;
    private boolean ligada;

    public String getPlaca() { return placa; }
    public void setPlaca(String placa) { this.placa = placa; }

    public String getCor() { return cor; }
    public void setCor(String cor) { this.cor = cor; }

    public int getCilindradas() { return cilindradas; }
    public void setCilindradas(int cilindradas) { this.cilindradas = Math.max(0, cilindradas); }

    public double getVelocidadeMaxima() { return velocidadeMaxima; }
    public void setVelocidadeMaxima(double velocidadeMaxima) { this.velocidadeMaxima = Math.max(0, velocidadeMaxima); }

    public boolean isLigada() { return ligada; }
    public void setLigada(boolean ligada) { this.ligada = ligada; }

    public void excluir() {
        placa = null;
        cor = null;
        cilindradas = 0;
        velocidadeMaxima = 0;
        ligada = false;
    }

    @Override
    public String toString() {
        return "MotoEncapsulada{placa=" + placa + ", cor=" + cor + ", cilindradas=" + cilindradas + ", velocidadeMaxima=" + velocidadeMaxima + ", ligada=" + ligada + "}";
    }
}
