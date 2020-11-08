package br.edu.prjcalculadora;

import br.edu.prjcalculadora.view.TelaCalculadora;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        JFrame janela = new JFrame("Calculadora Básica");
        janela.setContentPane(new TelaCalculadora().getCalculadora());
        janela.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        janela.pack();
        janela.setVisible(true);
    }
}
