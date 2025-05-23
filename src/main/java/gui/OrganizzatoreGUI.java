package gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import controller.ControllerLoginOrg;
import controller.ControllerOrganizzatore;
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
    private boolean premuto = false;
    private LoginOrganizzatoreGUI loginOrganizzatore;
    private ControllerLoginOrg controllerLoginOrg;
    private ControllerOrganizzatore controllerOrganizzatore;
    private Organizzatore organizzatore;

    public OrganizzatoreGUI(JFrame frame, ControllerOrganizzatore controllerOrganizzatore, Organizzatore organizzatore) {
        frameOrganizzatore = new JFrame("Organizzatore");
        frameOrganizzatore.setContentPane(this.panelOrganizzatore);
        frameOrganizzatore.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameOrganizzatore.setSize(800,800);
        frameOrganizzatore.setVisible(true);
        this.controllerOrganizzatore = controllerOrganizzatore;
        this.organizzatore = organizzatore;
        controllerLoginOrg = new ControllerLoginOrg(organizzatore, nomeOrganizzatoreTextField.getText(), passwordOrganizzatoreField.getText());
        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frameOrganizzatore.dispose();
                frame.setVisible(true);
            }
        });
        confermaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controllerOrganizzatore.controllaConferma(frameOrganizzatore, nomeOrganizzatoreTextField.getText(), passwordOrganizzatoreField.getText(), premuto, controllerOrganizzatore);
            }
        });
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = nomeOrganizzatoreTextField.getText();
                String password = passwordOrganizzatoreField.getText();

                organizzatore.setOrganizzatore(nome, password);
                controllerLoginOrg = new ControllerLoginOrg(organizzatore, nome, password);
                loginOrganizzatore = new LoginOrganizzatoreGUI(frameOrganizzatore, controllerOrganizzatore, controllerLoginOrg, organizzatore);
            }
        });
    }
}
