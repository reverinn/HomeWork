package gui;

import controller.Controller;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class Utente {

    private JPanel panelUtente;
    private JButton closeButton;
    private JLabel regutente;
    private JTextField nomeUtenteTextField;
    private JPasswordField passwordPasswordField;
    private JLabel etNomeUtente;
    private JLabel etPassword;
    private JButton confermaButton;
    public JFrame frameUtente;

    public Utente(JFrame frame, Controller controller) {
        frameUtente = new JFrame("Utente");
        frameUtente.setContentPane(this.panelUtente);
        frameUtente.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameUtente.setSize(800, 800);
        frameUtente.setVisible(true);
        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frameUtente.setVisible(false);
                frame.setVisible(true);
            }
        });
        passwordPasswordField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });
    }

}






