package gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import controller.ControllerOrganizzatore;

public class OrganizzatoreGUI {
    private JPanel panelOrganizzatore;
    private JButton closeButton;
    private JTextField nomeOrganizzatoreTextField;
    private JPasswordField passwordOrganizzatoreField;
    private JLabel etNomeOrganizzatore;
    private JButton confermaButton;
    public JFrame frameOrganizzatore;

    public OrganizzatoreGUI(JFrame frame, ControllerOrganizzatore controller) {
        frameOrganizzatore = new JFrame("Organizzatore");
        frameOrganizzatore.setContentPane(this.panelOrganizzatore);
        frameOrganizzatore.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameOrganizzatore.setSize(800,800);
        frameOrganizzatore.setVisible(true);
        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frameOrganizzatore.setVisible(false);
                frame.setVisible(true);
            }
        });
        confermaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frameOrganizzatore,"Registrazione avvenuta con successo!");
                frameOrganizzatore.setVisible(false);
                frame.setVisible(true);
                String nomeOrganizzatore = nomeOrganizzatoreTextField.getText();
                String passwordOrganizzatore = passwordOrganizzatoreField.getText();
                controller.setOrganizzatore(passwordOrganizzatore, nomeOrganizzatore);
                controller.mostraOrganizzatore(frame, nomeOrganizzatore, passwordOrganizzatore);
            }
        });
    }
}
