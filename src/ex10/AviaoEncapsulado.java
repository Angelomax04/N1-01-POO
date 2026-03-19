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

    public void decolar() {
        if (!voando) {
            voando = true;
            if (altitude == 0) {
                altitude = 1;
            }
            System.out.println("Aviao decolou.");
        } else {
            System.out.println("O aviao ja esta voando.");
        }
    }

    public void aterrissar() {
        if (voando || altitude > 0) {
            altitude = 0;
            voando = false;
            System.out.println("Aviao aterrissou.");
        } else {
            System.out.println("O aviao ja esta no solo.");
        }
    }

    public void subir(int metros) {
        if (!voando) {
            System.out.println("Nao e possivel subir: o aviao nao esta voando.");
            return;
        }
        if (metros <= 0) {
            System.out.println("Informe um valor positivo para subir.");
            return;
        }
        altitude += metros;
        System.out.println("Aviao subiu " + metros + " metros.");
    }

    public void descer(int metros) {
        if (!voando && altitude == 0) {
            System.out.println("O aviao ja esta no solo.");
            return;
        }
        if (metros <= 0) {
            System.out.println("Informe um valor positivo para descer.");
            return;
        }

        altitude -= metros;
        if (altitude <= 0) {
            altitude = 0;
            voando = false;
            System.out.println("Aviao desceu e chegou ao solo.");
        } else {
            System.out.println("Aviao desceu " + metros + " metros.");
        }
    }



    @Override
    public String toString() {
        return "AviaoEncapsulado{modelo=" + modelo + ", capacidade=" + capacidade + ", altitude=" + altitude + ", voando=" + voando + "}";
    }
}
