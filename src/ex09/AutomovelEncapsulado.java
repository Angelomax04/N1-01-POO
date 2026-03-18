package src.ex09;

public class AutomovelEncapsulado {
    private String placa;
    private String cor;
    private int ano;
    private double km;
    private boolean ligado;

    public String getPlaca() { return placa; }
    public void setPlaca(String placa) { this.placa = placa; }

    public String getCor() { return cor; }
    public void setCor(String cor) { this.cor = cor; }

    public int getAno() { return ano; }
    public void setAno(int ano) { this.ano = Math.max(0, ano); }

    public double getKm() { return km; }
    public void setKm(double km) { this.km = Math.max(0, km); }

    public boolean isLigado() { return ligado; }
    public void setLigado(boolean ligado) { this.ligado = ligado; }

    public void excluir() {
        placa = null;
        cor = null;
        ano = 0;
        km = 0;
        ligado = false;
    }

    @Override
    public String toString() {
        return "AutomovelEncapsulado{placa=" + placa + ", cor=" + cor + ", ano=" + ano + ", km=" + km + ", ligado=" + ligado + "}";
    }
}
