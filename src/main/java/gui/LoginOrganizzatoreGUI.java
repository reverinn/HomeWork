package gui;

import javax.swing.*;

import controller.ControllerLoginOrg;
import controller.ControllerOrganizzatore;
import model.Organizzatore;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginOrganizzatoreGUI {
    private String nome;
    private String password;
    private JTextField loginTextField;
    private JPasswordField loginPasswordField;
    private JButton confermaButton;
    private JButton closeButton;
    private JPanel panelLoginOrg;
    private JButton apriIscrizioniButton;
    private JButton chiudiIscrizioniButton;
    private JFrame frameLoginOrg;
    public LoginOrganizzatoreGUI(JFrame frameOrganizzatore, ControllerOrganizzatore controllerOrganizzatore, ControllerLoginOrg controllerLoginOrg, Organizzatore organizzatore){
        frameLoginOrg=new JFrame("Login Organizzatore");
        frameLoginOrg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameLoginOrg.setContentPane(this.panelLoginOrg);
        frameLoginOrg.setSize(800,800);
        frameLoginOrg.setVisible(true);
        confermaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controllerLoginOrg.ControllaPassword(frameOrganizzatore, frameLoginOrg , organizzatore, controllerOrganizzatore, loginTextField.getText(), loginPasswordField.getText());
            }
        });
        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frameOrganizzatore.setVisible(true);
                frameLoginOrg.dispose();
            }
        });
        apriIscrizioniButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controllerLoginOrg.verificaAperturaIscrizioni(frameLoginOrg, controllerOrganizzatore);
            }
        });
        chiudiIscrizioniButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controllerOrganizzatore.setApertura(false);
                controllerLoginOrg.verificaAperturaIscrizioni(frameLoginOrg, controllerOrganizzatore);
            }
        });
    }
}

