package src.ex02;

public class Barco {
    boolean andando;
    double velocidade;
    boolean ancoraGuardada;

    public Barco() {
        // Estado inicial para facilitar teste no menu
        this.andando = false;
        this.velocidade = 0;
        this.ancoraGuardada = true;
    }

    public void entrarEmMovimento() {
        if (!andando && ancoraGuardada) {
            andando = true;
            if (velocidade == 0) velocidade = 1;
        }
    }

    public void parar() {
        if (andando) {
            andando = false;
            velocidade = 0;
        }
    }

    public void acelerar(double v) {
        if (v > 0 && ancoraGuardada) {
            velocidade += v;
            if (velocidade > 0) andando = true;
        }
    }

    public void desacelerar(double v) {
        if (v <= 0) return;
        velocidade -= v;
        if (velocidade <= 0) {
            velocidade = 0;
            andando = false;
        }
    }

    public void descerAncora() {
        ancoraGuardada = false;
        andando = false;
        velocidade = 0;
    }

    public void subirAncora() {
        ancoraGuardada = true;
    }

    @Override
    public String toString() {
        return "Barco{andando=" + andando + ", velocidade=" + velocidade + ", ancoraGuardada=" + ancoraGuardada + "}";
    }
}
