package gui;

import javax.swing.*;

import controller.ControllerLoginOrg;
import controller.ControllerOrganizzatore;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginOrganizzatoreGUI {
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JButton confermaButton;
    private JButton closeButton;
    private JPanel panelLoginOrg;
    private JFrame frameLoginOrg;
    public LoginOrganizzatoreGUI(JFrame frameOrganizzatore, ControllerOrganizzatore controllerOrganizzatore, ControllerLoginOrg controllerLoginOrg){
        frameLoginOrg=new JFrame("Login Organizzatore");
        frameLoginOrg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameLoginOrg.setContentPane(this.panelLoginOrg);
        frameLoginOrg.setSize(800,800);
        frameLoginOrg.setVisible(true);
        frameOrganizzatore.setVisible(false);
        confermaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controllerLoginOrg.ControllaPassword(frameOrganizzatore, frameLoginOrg ,textField1.getText().toString(), passwordField1.getText().toString());
            }
        });
        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frameOrganizzatore.setVisible(true);
                frameLoginOrg.dispose();
            }
        });
    }
}

