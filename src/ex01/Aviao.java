package src.ex01;

public class Aviao {
    private int altitude;
    private boolean voando;

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
        return "Aviao{altitude=" + altitude + ", voando=" + voando + "}";
    }
}
