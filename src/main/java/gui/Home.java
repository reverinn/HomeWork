package gui;


import controller.*;
import model.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * The type Home.
 */
public class Home {
    private JPanel panelHome;
    private JButton utenteButton;
    private JButton teamButton;
    private JButton giudiciButton;
    private JButton organizzatoreButton;
    private JLabel TITOLO;
    private static JFrame frameHome;
    private ControllerTeam controllerTeam;
    private ControllerOrganizzatore controllerOrganizzatore;
    private ControllerUtente controllerUtente;
    private ControllerLoginGiudice controllerLoginGiudice;
    private LoginGiudiceGUI loginGiudiceGUI;

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        frameHome = new JFrame("Home");
        frameHome.setContentPane(new Home().panelHome);
        frameHome.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameHome.setVisible(true);
        frameHome.setSize(1920,1080);
    }

    /**
     * Instantiates a new Home.
     */
    public Home() {
        Organizzatore organizzatore = new Organizzatore();
        controllerOrganizzatore = new ControllerOrganizzatore(organizzatore);
        controllerUtente = new ControllerUtente();
        controllerTeam = new ControllerTeam();
        controllerLoginGiudice = new ControllerLoginGiudice(controllerTeam);
        utenteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                UtenteGUI utenteGUI = new UtenteGUI(controllerUtente, frameHome, controllerOrganizzatore);
                utenteGUI.frameUtente.setVisible(true);
                frameHome.setVisible(false);
            }
        });
        teamButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TeamGUI teamGUI = new TeamGUI(frameHome, controllerOrganizzatore, controllerTeam);
                teamGUI.frameTeam.setVisible(true);
                frameHome.setVisible(false);
            }
        });
        giudiciButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                loginGiudiceGUI = new LoginGiudiceGUI(frameHome, controllerLoginGiudice);
                frameHome.setVisible(false);
            }
        });
        organizzatoreButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                OrganizzatoreGUI organizzatoreGUI = new OrganizzatoreGUI(frameHome, controllerUtente, controllerOrganizzatore, organizzatore, controllerTeam);
                organizzatoreGUI.frameOrganizzatore.setVisible(true);
                frameHome.setVisible(false);
            }
        });
    }

}
