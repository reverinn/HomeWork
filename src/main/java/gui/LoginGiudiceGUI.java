package gui;

import javax.swing.*;

import controller.ControllerLoginGiudice;
import controller.ControllerOrganizzatore;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginGiudiceGUI {
    private JTextField loginGiudiceTextField;
    private JButton confermaButton;
    private JButton closeButton;
    private JLabel LoginGiudice;
    private JPanel loginGiudiceLabel;
    private JPasswordField loginGiudicePasswordField;
    private JComboBox votoBox;
    private JComboBox teamDaVotareBox;
    private JButton OKButton;
    private JButton pubblicaClassificheButton;
    private JFrame frameLoginGiudice;
    public LoginGiudiceGUI(JFrame frameHome, ControllerLoginGiudice controllerLoginGiudice, ControllerOrganizzatore controllerOrganizzatore) {
        frameLoginGiudice=new JFrame("Login Giudice");
        frameLoginGiudice.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameLoginGiudice.setSize(800,800);
        frameLoginGiudice.setContentPane(this.loginGiudiceLabel);
        frameLoginGiudice.setVisible(true);
        frameHome.setVisible(false);
        confermaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controllerLoginGiudice.controllaPassword(frameLoginGiudice, loginGiudiceTextField.getText(), loginGiudicePasswordField.getText());
            }
        });
        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frameHome.setVisible(true);
                frameLoginGiudice.dispose();
            }
        });
        teamDaVotareBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controllerLoginGiudice.controllaLogin(frameLoginGiudice);
            }
        });
        OKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controllerLoginGiudice.aggiungiVoto(frameLoginGiudice, teamDaVotareBox.getSelectedItem().toString(), votoBox.getSelectedItem().toString());
            }
        });
        pubblicaClassificheButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controllerLoginGiudice.Classifica(frameLoginGiudice);
            }
        });
    }

}
