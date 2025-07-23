package gui;

import javax.swing.*;

import controller.ControllerLoginGiudice;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * The type Login giudice gui.
 */
public class LoginGiudiceGUI {
    private JTextField loginGiudiceTextField;
    private JButton confermaButton;
    private JButton closeButton;
    private JLabel loginGIudice;
    private JPanel loginGiudiceLabel;
    private JPasswordField loginGiudicePasswordField;
    private JComboBox teamDaVotareBox;
    private JButton okButton;
    private JButton pubblicaClassificheButton;
    private JTextField votoTextField;
    private JButton registratiButton;
    private JFrame frameLoginGiudice;

    /**
     * Instantiates a new Login giudice gui.
     *
     * @param frameHome              the frame home
     * @param controllerLoginGiudice the controller login giudice
     */
    public LoginGiudiceGUI(JFrame frameHome, ControllerLoginGiudice controllerLoginGiudice) {
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
        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int valore = Integer.parseInt(votoTextField.getText());
                controllerLoginGiudice.assegnaVoto(frameLoginGiudice, teamDaVotareBox.getSelectedItem().toString(), valore);
                System.out.println("Valore assegnato:" + valore);
            }
        });
        pubblicaClassificheButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controllerLoginGiudice.stampaClassifica(frameLoginGiudice);
            }
        });
        registratiButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controllerLoginGiudice.registra(frameLoginGiudice, loginGiudiceTextField.getText(), loginGiudicePasswordField.getText());
            }
        });
    }

}
