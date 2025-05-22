package gui;

import javax.swing.*;
import controller.ControllerOrganizzatore;
public class LoginOrganizzatore {
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JButton confermaButton;
    private JButton closeButton;
    private JPanel panelLoginOrg;
    private JFrame frameLoginOrg;
    public LoginOrganizzatore(JFrame frameOrganizzatore,ControllerOrganizzatore controllerOrganizzatore){
        frameLoginOrg=new JFrame("Login Organizzatore");
        frameLoginOrg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameLoginOrg.setContentPane(this.panelLoginOrg);
        frameLoginOrg.setSize(800,800);
        frameLoginOrg.setVisible(true);
        frameOrganizzatore.setVisible(false);
    }
}

