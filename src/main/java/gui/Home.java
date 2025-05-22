package gui;


import controller.Controller;

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
    private Controller controller;


    public static void main(String[] args) {
        frameHome = new JFrame("Home");
        frameHome.setContentPane(new Home().panelHome);
        frameHome.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameHome.setVisible(true);
        frameHome.setSize(1920,1080);
    }

    public Home() {
        controller = new Controller();
        utenteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Utente utenteGUI = new Utente(frameHome, controller);
                utenteGUI.frameUtente.setVisible(true);
                frameHome.setVisible(false);

            }
        });
        teamButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Team teamGUI = new Team(frameHome, controller);
                teamGUI.frameTeam.setVisible(true);
                frameHome.setVisible(false);
            }
        });
        giudiciButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Giudici giudiciGUI = new Giudici(frameHome, controller);
                giudiciGUI.frameGiudice.setVisible(true);
                frameHome.setVisible(false);
            }
        });
        organizzatoreButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                Organizzatore organizzatoreGUI = new Organizzatore(frameHome, controller);
                organizzatoreGUI.frameOrganizzatore.setVisible(true);
                frameHome.setVisible(false);
            }
        });
    }


}
