package gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import controller.ControllerTeam;
import controller.ControllerOrganizzatore;

public class TeamGUI {
    private JPanel teamPanel;
    private JButton closeButton;
    private JComboBox teamBox;
    private JLabel etselTeam;
    private JButton okButton;
    private JButton CARICADOCUMENTOButton;
    public JFrame frameTeam;
    public TeamGUI(JFrame frame, ControllerOrganizzatore controllerOrganizzatore, ControllerTeam controllerTeam) {
        frameTeam = new JFrame("Team");
        frameTeam.setContentPane(this.teamPanel);
        frameTeam.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameTeam.setSize(800,800);
        frameTeam.setVisible(true);
        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frameTeam.dispose();
                frame.setVisible(true);
            }
        });
        okButton.addActionListener(new ActionListener() {
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
