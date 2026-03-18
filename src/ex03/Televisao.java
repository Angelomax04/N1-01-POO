package src.ex03;

public class Televisao {
    boolean ligada;
    int volume;
    int canal;

    public void ligar() { ligada = true; if (canal == 0) canal = 1; }
    public void desligar() { ligada = false; }
    public void aumentarCanal() { if (ligada) canal++; }
    public void diminuirCanal() { if (ligada && canal > 0) canal--; }
    public void aumentarVolume() { if (ligada) volume++; }
    public void diminuirVolume() { if (ligada && volume > 0) volume--; }

    @Override
    public String toString() {
        return "Televisao{ligada=" + ligada + ", volume=" + volume + ", canal=" + canal + "}";
    }
}
