package gui;

import javax.swing.*;

public class Organizzatore {
    private JPanel panelOrganizzatore;
    public JFrame frameOrganizzatore;
    public Organizzatore(JFrame frame) {
        frameOrganizzatore = new JFrame("Organizzatore");
        frameOrganizzatore.setContentPane(new Organizzatore().panelOrganizzatore);
        frameOrganizzatore.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameOrganizzatore.setSize(800,800);
        frameOrganizzatore.setVisible(true);
    }
    public Organizzatore() { }
}
