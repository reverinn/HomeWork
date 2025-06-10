package gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.Team;
import controller.ControllerTeam;

import controller.ControllerOrganizzatore;

public class TeamGUI {
    private JPanel teamPanel;
    private JButton closeButton;
    private JComboBox teamBox;
    private JLabel etselTeam;
    private JButton OKButton;
    private JButton CARICADOCUMENTOButton;
    public JFrame frameTeam;
    public TeamGUI(Team team, JFrame frame, ControllerOrganizzatore controllerOrganizzatore) {
        frameTeam = new JFrame("Team");
        frameTeam.setContentPane(this.teamPanel);
        frameTeam.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameTeam.setSize(800,800);
        frameTeam.setVisible(true);
        ControllerTeam controllerTeam = new ControllerTeam(team);
        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frameTeam.dispose();
                frame.setVisible(true);
            }
        });
        OKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controllerTeam.controllaOK(frame,frameTeam, teamBox.getSelectedItem().toString(), controllerOrganizzatore);
            }
        });
        CARICADOCUMENTOButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controllerTeam.controllaCaricamento(frameTeam, controllerOrganizzatore);
            }
        });
    }

}
