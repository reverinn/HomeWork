package gui;

import javax.swing.*;

import controller.ControllerLoginOrg;
import controller.ControllerOrganizzatore;
import controller.ControllerUtente;
import model.Organizzatore;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * The type Login organizzatore gui.
 */
public class LoginOrganizzatoreGUI {
    private JTextField loginTextField;
    private JPasswordField loginPasswordField;
    private JButton confermaButton;
    private JButton closeButton;
    private JPanel panelLoginOrg;
    private JButton apriIscrizioniButton;
    private JButton chiudiIscrizioniButton;
    private JFrame frameLoginOrg;

    /**
     * Instantiates a new Login organizzatore gui.
     *
     * @param frameOrganizzatore      the frame organizzatore
     * @param controllerUtente        the controller utente
     * @param controllerOrganizzatore the controller organizzatore
     * @param controllerLoginOrg      the controller login org
     * @param organizzatore           the organizzatore
     */
    public LoginOrganizzatoreGUI(JFrame frameOrganizzatore, ControllerUtente controllerUtente, ControllerOrganizzatore controllerOrganizzatore, ControllerLoginOrg controllerLoginOrg, Organizzatore organizzatore){
        frameLoginOrg=new JFrame("Login Organizzatore");
        frameLoginOrg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameLoginOrg.setContentPane(this.panelLoginOrg);
        frameLoginOrg.setSize(800,800);
        frameLoginOrg.setVisible(true);
        confermaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controllerLoginOrg.controllaPassword(frameLoginOrg , organizzatore, controllerOrganizzatore, loginTextField.getText(), loginPasswordField.getText());
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
                controllerLoginOrg.chiudiIscrizioni(frameLoginOrg, controllerOrganizzatore);
                controllerLoginOrg.verificaAperturaIscrizioni(frameLoginOrg, controllerOrganizzatore);
            }
        });
    }
}

