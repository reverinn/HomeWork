package gui;

import controller.ControllerGiudice;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GiudiceGUI {
    private JPanel panelGiudice;
    private JButton closeButton;
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JLabel etNomeGiudice;
    private JButton confermaButton;
    public JFrame frameGiudice;
    public GiudiceGUI(JFrame frame, ControllerGiudice controller) {
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
        confermaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frameGiudice,"Registrazione avvenuta con successo!");
                frameGiudice.setVisible(false);
                frame.setVisible(true);
                String nomeGiudice = textField1.getText();
                String passwordGiudice = passwordField1.getText();
                controller.setGiudice(passwordGiudice, nomeGiudice);
                controller.mostraGiudice(frame, passwordGiudice, nomeGiudice);
            }
        });
    }
}
