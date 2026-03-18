package src.ex10;

public class AviaoEncapsulado {
    private String modelo;
    private int capacidade;
    private int altitude;
    private boolean voando;

    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }

    public int getCapacidade() { return capacidade; }
    public void setCapacidade(int capacidade) { this.capacidade = Math.max(0, capacidade); }

    public int getAltitude() { return altitude; }
    public void setAltitude(int altitude) { this.altitude = Math.max(0, altitude); }

    public boolean isVoando() { return voando; }
    public void setVoando(boolean voando) { this.voando = voando; }

    public void excluir() {
        modelo = null;
        capacidade = 0;
        altitude = 0;
        voando = false;
    }

    @Override
    public String toString() {
        return "AviaoEncapsulado{modelo=" + modelo + ", capacidade=" + capacidade + ", altitude=" + altitude + ", voando=" + voando + "}";
    }
}
