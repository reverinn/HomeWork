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
    private JButton apriButton;
    private JButton chiudiButton;
    private JButton loginButton;
    public JFrame frameOrganizzatore;
    private boolean premuto = false;
    private LoginOrganizzatoreGUI loginOrganizzatore;
    private ControllerLoginOrg controllerLoginOrg;

    public OrganizzatoreGUI(JFrame frame, ControllerOrganizzatore controller) {
        frameOrganizzatore = new JFrame("Organizzatore");
        frameOrganizzatore.setContentPane(this.panelOrganizzatore);
        frameOrganizzatore.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameOrganizzatore.setSize(800,800);
        frameOrganizzatore.setVisible(true);
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
                controller.controllaConferma(frameOrganizzatore, nomeOrganizzatoreTextField.toString(), passwordOrganizzatoreField.getText(), premuto);
            }
        });
        apriButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.controllaApertura(frame, frameOrganizzatore, nomeOrganizzatoreTextField.getText(), passwordOrganizzatoreField.getText());
            }
        });
        chiudiButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               controller.controllaChiusura(frame, frameOrganizzatore, nomeOrganizzatoreTextField.getText(), passwordOrganizzatoreField.getText());
            }
        });
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Organizzatore organizzatore = new Organizzatore();
                ControllerLoginOrg controllerLoginOrg = new ControllerLoginOrg(organizzatore, nomeOrganizzatoreTextField.getText(), passwordOrganizzatoreField.getText());
                loginOrganizzatore=new LoginOrganizzatoreGUI(frameOrganizzatore,controller, controllerLoginOrg);
            }
        });
    }
}
