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

    public UtenteGUI(JFrame frame, ControllerUtente controller, ControllerOrganizzatore controllerOrganizzatore) {
        frameUtente = new JFrame("Utente");
        frameUtente.setContentPane(this.panelUtente);
        frameUtente.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameUtente.setSize(800, 800);
        frameUtente.setVisible(true);
        this.controllerOrganizzatore = controllerOrganizzatore;
        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frameUtente.setVisible(false);
                frame.setVisible(true);
            }
        });
        confermaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!controllerOrganizzatore.getApertura()){
                    JOptionPane.showMessageDialog(frameUtente,"Le iscrizioni sono chiuse!");
                }
                else {
                    if (!nomeUtenteTextField.getText().isEmpty() || !passwordPasswordField.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(frameUtente, "Registrazione avvenuta con successo!");
                        frameUtente.setVisible(false);
                        frame.setVisible(true);
                        String nomeUtente = nomeUtenteTextField.getText();
                        String passwordUtente = passwordPasswordField.getText();
                        controller.setUtente(passwordUtente, nomeUtente);
                    } else {
                        JOptionPane.showMessageDialog(frameUtente, "Inserire tutti i campi!");
                    }
                }
            }
        });
    }

}






