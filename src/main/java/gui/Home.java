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
    private ControllerTeam controllerTeam;
    private ControllerGiudice controllerGiudice;
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
                UtenteGUI utenteGUI = new UtenteGUI(utente, frameHome, controllerOrganizzatore);
                utenteGUI.frameUtente.setVisible(true);
                frameHome.setVisible(false);

            }
        });
        teamButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Team team = new Team();
                TeamGUI teamGUI = new TeamGUI(team, frameHome, controllerOrganizzatore);
                teamGUI.frameTeam.setVisible(true);
                frameHome.setVisible(false);
            }
        });
        giudiciButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Giudice giudice = new Giudice();
                controllerGiudice = new ControllerGiudice(giudice);
                GiudiceGUI giudiceGUI = new GiudiceGUI(frameHome, controllerGiudice, controllerOrganizzatore);
                giudiceGUI.frameGiudice.setVisible(true);
                frameHome.setVisible(false);
            }
        });
        organizzatoreButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                OrganizzatoreGUI organizzatoreGUI = new OrganizzatoreGUI(frameHome, controllerOrganizzatore, organizzatore);
                organizzatoreGUI.frameOrganizzatore.setVisible(true);
                frameHome.setVisible(false);
            }
        });
    }


}
