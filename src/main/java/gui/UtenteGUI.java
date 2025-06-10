package gui;

import controller.*;
import model.Utente;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class UtenteGUI {

    private JPanel panelUtente;
    private JButton closeButton;
    private JLabel regutente;
    private JTextField nomeUtenteTextField;
    private JPasswordField passwordPasswordField;
    private JLabel etNomeUtente;
    private JLabel etPassword;
    private JButton confermaButton;
    public JFrame frameUtente;
    ControllerUtente controllerUtente;

    public UtenteGUI(Utente utente, JFrame frameHome, ControllerOrganizzatore controllerOrganizzatore) {
        frameUtente = new JFrame("Utente");
        frameUtente.setContentPane(this.panelUtente);
        frameUtente.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameUtente.setSize(800, 800);
        frameUtente.setVisible(true);
        controllerUtente = new ControllerUtente(utente);
        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frameUtente.dispose();
                frameHome.setVisible(true);
            }
        });
        confermaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               controllerUtente.controllaConferma(frameHome, frameUtente, nomeUtenteTextField.getText(), passwordPasswordField.getText(), controllerOrganizzatore);
            }
        });
    }

}






