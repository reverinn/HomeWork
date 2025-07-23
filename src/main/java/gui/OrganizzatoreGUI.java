package gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import controller.ControllerLoginOrg;
import controller.ControllerOrganizzatore;
import controller.ControllerUtente;
import controller.ControllerTeam;
import model.Organizzatore;

/**
 * The type Organizzatore gui.
 */
public class OrganizzatoreGUI {
    private JPanel panelOrganizzatore;
    private JButton closeButton;
    private JTextField nomeOrganizzatoreTextField;
    private JPasswordField passwordOrganizzatoreField;
    private JLabel etNomeOrganizzatore;
    private JButton confermaButton;
    private JButton loginButton;
    /**
     * The Frame organizzatore.
     */
    public JFrame frameOrganizzatore;
    private LoginOrganizzatoreGUI loginOrganizzatore;
    private ControllerLoginOrg controllerLoginOrg;

    /**
     * Instantiates a new Organizzatore gui.
     *
     * @param frameHome               the frame home
     * @param controllerUtente        the controller utente
     * @param controllerOrganizzatore the controller organizzatore
     * @param organizzatore           the organizzatore
     * @param controllerTeam          the controller team
     */
    public OrganizzatoreGUI(JFrame frameHome, ControllerUtente controllerUtente, ControllerOrganizzatore controllerOrganizzatore, Organizzatore organizzatore, ControllerTeam controllerTeam) {
        frameOrganizzatore = new JFrame("Organizzatore");
        frameOrganizzatore.setContentPane(this.panelOrganizzatore);
        frameOrganizzatore.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameOrganizzatore.setSize(800,800);
        frameOrganizzatore.setVisible(true);
        controllerLoginOrg = new ControllerLoginOrg(controllerTeam);
        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frameOrganizzatore.dispose();
                frameHome.setVisible(true);
            }
        });
        confermaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = nomeOrganizzatoreTextField.getText();
                String password = passwordOrganizzatoreField.getText();
                controllerOrganizzatore.controllaConferma(frameOrganizzatore, nome, password);
            }
        });
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frameOrganizzatore.setVisible(false);
                loginOrganizzatore = new LoginOrganizzatoreGUI(frameOrganizzatore, controllerUtente, controllerOrganizzatore, controllerLoginOrg, organizzatore);
            }
        });
    }
}
