package br.edu.prjcalculadora.view;

import br.edu.prjcalculadora.model.Calculadora;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;



public class TelaCalculadora {


    private JPanel Calculadora;
    private JTextField textField1;
    private JTextField textField2;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JTextField textField3;


    public JPanel getCalculadora() {
        return Calculadora;
    }

    public TelaCalculadora() {
        button4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                br.edu.prjcalculadora.model.Calculadora calculadora = new Calculadora();
                try{
                    calculadora.setVlr1(Double.parseDouble(textField1.getText()));
                    calculadora.setVlr2(Double.parseDouble(textField2.getText()));
                    calculadora.soma(calculadora.getVlr1(),calculadora.getVlr2());
                    textField3.setText(String.valueOf(calculadora.getResult()));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Erro na conversão de dados");
                    System.out.println(" erro:" + ex.getMessage());
                }

            }
        });
        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Calculadora calculadora = new Calculadora();
                try{
                    calculadora.setVlr1(Double.parseDouble(textField1.getText()));
                    calculadora.setVlr2(Double.parseDouble(textField2.getText()));
                    calculadora.subtracao(calculadora.getVlr1(),calculadora.getVlr2());
                    textField3.setText(String.valueOf(calculadora.getResult()));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Erro na conversão de dados");
                    System.out.println(" erro:" + ex.getMessage());
                }

            }
        });
        button2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Calculadora calculadora = new Calculadora();
                try{
                    calculadora.setVlr1(Double.parseDouble(textField1.getText()));
                    calculadora.setVlr2(Double.parseDouble(textField2.getText()));
                    calculadora.multiplicacao(calculadora.getVlr1(),calculadora.getVlr2());
                    textField3.setText(String.valueOf(calculadora.getResult()));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Erro na conversão de dados");
                    System.out.println(" erro:" + ex.getMessage());
                }

            }
        });
        button3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Calculadora calculadora = new Calculadora();
                try {
                    calculadora.setVlr1(Double.parseDouble(textField1.getText()));
                    calculadora.setVlr2(Double.parseDouble(textField2.getText()));

                    // não estava apresentando exception (com o catch) quando vlr2=0, tive que inserir a condição abaixo para dar mensagem
                    if (calculadora.getVlr2() != 0) {
                        calculadora.divisao(calculadora.getVlr1(), calculadora.getVlr2());
                    } else {
                        JOptionPane.showMessageDialog(null, "É impossível dividir por 0 (zero)");
                        System.out.println("erro: 0 (zero) no divisor");
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Erro na conversão de dados");
                    System.out.println(" erro:" + ex.getMessage());
                }
                textField3.setText(String.valueOf(calculadora.getResult()));

                }

        });
    }
}








