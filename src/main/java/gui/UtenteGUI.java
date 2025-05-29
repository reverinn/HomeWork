package gui;

import controller.*;

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
    private ControllerOrganizzatore controllerOrganizzatore;

    public UtenteGUI(JFrame frame, ControllerUtente controllerUtente, ControllerOrganizzatore controllerOrganizzatore) {
        frameUtente = new JFrame("Utente");
        frameUtente.setContentPane(this.panelUtente);
        frameUtente.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameUtente.setSize(800, 800);
        frameUtente.setVisible(true);
        this.controllerOrganizzatore = controllerOrganizzatore;
        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frameUtente.dispose();
                frame.setVisible(true);
            }
        });
        confermaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               controllerUtente.controllaConferma(frame, frameUtente, nomeUtenteTextField.getText(), passwordPasswordField.getText(), controllerOrganizzatore);
            }
        });
    }

}






