package src;

import javax.swing.JOptionPane;

public final class DialogUtil {
    private DialogUtil() {
    }

    public static void mostrarInfo(String mensagem) {
        JOptionPane.showMessageDialog(null, mensagem, "Informacao", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void mostrarErro(String mensagem) {
        JOptionPane.showMessageDialog(null, mensagem, "Erro", JOptionPane.ERROR_MESSAGE);
    }

    public static int lerOpcaoMenu(String titulo, String menu) {
        Integer valor = lerInt(titulo, menu);
        return valor == null ? 0 : valor;
    }

    public static Integer lerInt(String titulo, String mensagem) {
        while (true) {
            String entrada = JOptionPane.showInputDialog(null, mensagem, titulo, JOptionPane.QUESTION_MESSAGE);
            if (entrada == null) {
                return null;
            }
            try {
                return Integer.parseInt(entrada.trim());
            } catch (NumberFormatException ex) {
                mostrarErro("Digite um numero inteiro valido.");
            }
        }
    }

    public static Double lerDouble(String titulo, String mensagem) {
        while (true) {
            String entrada = JOptionPane.showInputDialog(null, mensagem, titulo, JOptionPane.QUESTION_MESSAGE);
            if (entrada == null) {
                return null;
            }
            try {
                return Double.parseDouble(entrada.trim().replace(',', '.'));
            } catch (NumberFormatException ex) {
                mostrarErro("Digite um numero decimal valido.");
            }
        }
    }

    public static String lerTexto(String titulo, String mensagem) {
        return JOptionPane.showInputDialog(null, mensagem, titulo, JOptionPane.QUESTION_MESSAGE);
    }

    public static Boolean lerBool(String titulo, String mensagem) {
        int op = JOptionPane.showConfirmDialog(null, mensagem, titulo, JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (op == JOptionPane.YES_OPTION) {
            return true;
        }
        if (op == JOptionPane.NO_OPTION) {
            return false;
        }
        return null;
    }
}

