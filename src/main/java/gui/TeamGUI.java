package gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import controller.ControllerOrganizzatore;
import controller.ControllerTeam;

public class TeamGUI {
    private JPanel teamPanel;
    private JButton closeButton;
    private JComboBox teamBox;
    private JLabel etselTeam;
    private JButton OKButton;
    private JButton CARICADOCUMENTOButton;
    private JButton VISUALIZZAVOTOButton;
    public JFrame frameTeam;
    public TeamGUI(JFrame frame, ControllerTeam controller, ControllerOrganizzatore controllerOrganizzatore) {
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
        OKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.controllaOK(frame,frameTeam, teamBox.getSelectedItem().toString(), controllerOrganizzatore);
            }
        });
    }

}
