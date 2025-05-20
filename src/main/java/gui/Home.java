package gui;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Home {
    private JPanel panelHome;
    private JTextField HACKATON20252026TextField;
    private JButton utenteButton;
    private JButton teamButton;
    private JButton giudiciButton;
    private JButton organizzatoreButton;
    private static JFrame frame;

    public Home() {
        utenteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Utente utenteGUI = new Utente(frame);
                utenteGUI.frameUtente.setVisible(true);
                frame.setVisible(false);

            }
        });
        teamButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Team teamGUI = new Team(frame);
                teamGUI.frameTeam.setVisible(true);
                frame.setVisible(false);
            }
        });
        giudiciButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Giudici giudiciGUI = new Giudici(frame);
                giudiciGUI.frameGiudice.setVisible(true);
                frame.setVisible(false);
            }
        });
        organizzatoreButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                Organizzatore organizzatoreGUI = new Organizzatore(frame);
                organizzatoreGUI.frameOrganizzatore.setVisible(true);
                frame.setVisible(false);
            }
        });
    }

    public static void main(String[] args) {
        frame = new JFrame("Home");
        frame.setContentPane(new Home().panelHome);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(1920,1080);
    }


}
