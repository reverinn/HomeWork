package gui;

import controller.Controller;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Giudici {
    private JPanel panelGiudice;
    private JButton closeButton;
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JLabel etNomeGiudice;
    private JButton confermaButton;
    public JFrame frameGiudice;
    public Giudici(JFrame frame, Controller controller) {
        frameGiudice = new JFrame("Giudici");
        frameGiudice.setContentPane(this.panelGiudice);
        frameGiudice.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameGiudice.setSize(800,800);
        frameGiudice.setVisible(true);
        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frameGiudice.setVisible(false);
                frame.setVisible(true);
            }
        });
    }
}
