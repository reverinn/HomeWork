package gui;

import javax.swing.*;

import controller.ControllerLoginGiudice;
import controller.ControllerTeam;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginGiudiceGUI {
    private JTextField loginGiudiceTextField;
    private JButton confermaButton;
    private JButton closeButton;
    private JLabel LoginGiudice;
    private JPanel loginGiudiceLabel;
    private JPasswordField loginGiudicePasswordField;
    private JComboBox teamDaVotareBox;
    private JButton OKButton;
    private JButton pubblicaClassificheButton;
    private JTextField votoTextField;
    private JFrame frameLoginGiudice;
    public LoginGiudiceGUI(JFrame frameHome, ControllerLoginGiudice controllerLoginGiudice, ControllerTeam controllerTeam) {
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
                controllerLoginGiudice.controllaLogin();
            }
        });
        OKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int valore = Integer.parseInt(votoTextField.getText());
                controllerLoginGiudice.assegnaVoto(frameLoginGiudice, controllerTeam, teamDaVotareBox.getSelectedItem().toString(), valore);
            }
        });
        pubblicaClassificheButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controllerLoginGiudice.stampaClassifica(frameLoginGiudice, controllerTeam);
            }
        });
    }

}
