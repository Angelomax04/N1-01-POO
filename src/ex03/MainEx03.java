package src.ex03;

import java.util.Scanner;

public class MainEx03 {
    public static void executar(Scanner sc) {
        Televisao tv = new Televisao();
        int op;
        do {
            System.out.println("\n--- Ex03 Televisao ---");
            System.out.println("1 Ligar");
            System.out.println("2 Desligar");
            System.out.println("3 Aumentar canal");
            System.out.println("4 Diminuir canal");
            System.out.println("5 Aumentar volume");
            System.out.println("6 Diminuir volume");
            System.out.println("0 Voltar");
            System.out.print("Opcao: ");
            op = lerInt(sc);

            switch (op) {
                case 1: tv.ligar(); break;
                case 2: tv.desligar(); break;
                case 3: tv.aumentarCanal(); break;
                case 4: tv.diminuirCanal(); break;
                case 5: tv.aumentarVolume(); break;
                case 6: tv.diminuirVolume(); break;
                case 0: break;
                default: System.out.println("Opcao invalida.");
            }
            System.out.println(tv);
        } while (op != 0);
    }

    private static int lerInt(Scanner sc) { while (!sc.hasNextInt()) sc.next(); int v = sc.nextInt(); sc.nextLine(); return v; }
}
