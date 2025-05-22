package gui;

import javax.swing.*;
import controller.ControllerGiudice;
public class LoginGiudice {
    private JTextField textField1;
    private JTextField textField2;
    private JButton confermaButton;
    private JButton closeButton;
    private JLabel LoginGiudice;
    private JPanel loginGiudiceLabel;
    private JFrame frameLoginGiudice;
    public LoginGiudice(JFrame frameGiudice, ControllerGiudice controllerGiudice) {
        frameLoginGiudice=new JFrame("Login Giudice");
        frameLoginGiudice.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameLoginGiudice.setSize(800,800);
        frameLoginGiudice.setContentPane(this.loginGiudiceLabel);
        frameLoginGiudice.setVisible(true);
        frameGiudice.setVisible(false);
    }
}
