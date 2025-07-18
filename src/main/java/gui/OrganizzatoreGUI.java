package gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import controller.ControllerLoginOrg;
import controller.ControllerOrganizzatore;
import controller.ControllerUtente;
import model.Organizzatore;

public class OrganizzatoreGUI {
    private JPanel panelOrganizzatore;
    private JButton closeButton;
    private JTextField nomeOrganizzatoreTextField;
    private JPasswordField passwordOrganizzatoreField;
    private JLabel etNomeOrganizzatore;
    private JButton confermaButton;
    private JButton loginButton;
    public JFrame frameOrganizzatore;
    private LoginOrganizzatoreGUI loginOrganizzatore;
    private ControllerLoginOrg controllerLoginOrg;

    public OrganizzatoreGUI(JFrame frameHome, ControllerUtente controllerUtente, ControllerOrganizzatore controllerOrganizzatore, Organizzatore organizzatore) {
        frameOrganizzatore = new JFrame("Organizzatore");
        frameOrganizzatore.setContentPane(this.panelOrganizzatore);
        frameOrganizzatore.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameOrganizzatore.setSize(800,800);
        frameOrganizzatore.setVisible(true);
        controllerLoginOrg = new ControllerLoginOrg(organizzatore);
        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frameOrganizzatore.dispose();
                frameHome.setVisible(true);
            }
        });
        confermaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = nomeOrganizzatoreTextField.getText();
                String password = passwordOrganizzatoreField.getText();
                controllerOrganizzatore.controllaConferma(frameOrganizzatore, nome, password);
            }
        });
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frameOrganizzatore.setVisible(false);
                loginOrganizzatore = new LoginOrganizzatoreGUI(frameOrganizzatore, controllerUtente, controllerOrganizzatore, controllerLoginOrg, organizzatore);
            }
        });
    }
}
