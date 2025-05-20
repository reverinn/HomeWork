package gui;

import javax.swing.*;

public class Giudici {
    private JPanel panelGiudice;
    public JFrame frameGiudice;
    public Giudici(JFrame frame) {
        frameGiudice = new JFrame("Giudici");
        frameGiudice.setContentPane(new Giudici().panelGiudice);
        frameGiudice.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameGiudice.setSize(800,800);
        frameGiudice.setVisible(true);
    }
    public Giudici() { }
}
