package gui;


import controller.*;
import model.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Home {
    private JPanel panelHome;
    private JButton utenteButton;
    private JButton teamButton;
    private JButton giudiciButton;
    private JButton organizzatoreButton;
    private JLabel TITOLO;
    private static JFrame frameHome;
    private ControllerUtente controllerUtente;
    private ControllerTeam controllerTeam;
    private ControllerGiudice controllerGiudici;
    private ControllerOrganizzatore controllerOrganizzatore;


    public static void main(String[] args) {
        frameHome = new JFrame("Home");
        frameHome.setContentPane(new Home().panelHome);
        frameHome.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameHome.setVisible(true);
        frameHome.setSize(1920,1080);
    }

    public Home() {
        Organizzatore organizzatore = new Organizzatore();
        controllerOrganizzatore = new ControllerOrganizzatore(organizzatore);
        utenteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Utente utente = new Utente();
                controllerUtente = new ControllerUtente(utente);
                UtenteGUI utenteGUI = new UtenteGUI(frameHome, controllerUtente, controllerOrganizzatore);
                utenteGUI.frameUtente.setVisible(true);
                frameHome.setVisible(false);

            }
        });
        teamButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Team team = new Team();
                controllerTeam = new ControllerTeam(team);
                TeamGUI teamGUI = new TeamGUI(frameHome, controllerTeam, controllerOrganizzatore);
                teamGUI.frameTeam.setVisible(true);
                frameHome.setVisible(false);
            }
        });
        giudiciButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Giudice giudice = new Giudice();
                controllerGiudici = new ControllerGiudice(giudice);
                GiudiceGUI giudiciGUI = new GiudiceGUI(frameHome, controllerGiudici, controllerOrganizzatore);
                giudiciGUI.frameGiudice.setVisible(true);
                frameHome.setVisible(false);
            }
        });
        organizzatoreButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                OrganizzatoreGUI organizzatoreGUI = new OrganizzatoreGUI(frameHome, controllerOrganizzatore);
                organizzatoreGUI.frameOrganizzatore.setVisible(true);
                frameHome.setVisible(false);
            }
        });
    }


}
