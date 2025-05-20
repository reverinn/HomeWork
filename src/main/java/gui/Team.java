package gui;

import javax.swing.*;

public class Team {
    private JPanel teamPanel;
    public JFrame frameTeam;
    public Team(JFrame frame) {
        frameTeam = new JFrame("Team");
        frameTeam.setContentPane(new Team().teamPanel);
        frameTeam.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameTeam.setSize(800,800);
        frameTeam.setVisible(true);
    }
    public Team() { }

}
