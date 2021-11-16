package xti;

import javax.swing.JOptionPane;

public class Entrada {

    public static void main(String[] args) {
        // var scanner = new Scanner(System.in);

        // System.out.println(" Qual o seu nome?");
        // String nome = scanner.nextLine();
        // System.out.println("Bem-vindo " + nome);

        String nome = JOptionPane.showInputDialog("Qual é o seu nome? ");
        JOptionPane.showMessageDialog(null, nome);

    }
}
