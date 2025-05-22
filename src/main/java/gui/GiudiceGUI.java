package gui;

import controller.ControllerGiudice;
import controller.ControllerOrganizzatore;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GiudiceGUI {
    private JPanel panelGiudice;
    private JButton closeButton;
    private JTextField nomeGiudiceTextField;
    private JPasswordField passwordGiudicePasswordField;
    private JLabel etNomeGiudice;
    private JButton confermaButton;
    public JFrame frameGiudice;
    public GiudiceGUI(JFrame frame, ControllerGiudice controller, ControllerOrganizzatore controllerOrganizzatore) {
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
                if (!controllerOrganizzatore.getApertura()){
                    JOptionPane.showMessageDialog(frameGiudice,"Le iscrizioni sono chiuse!");
                }
                else {
                    if (!nomeGiudiceTextField.getText().isEmpty() || !passwordGiudicePasswordField.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(frameGiudice, "Registrazione avvenuta con successo!");
                        frameGiudice.setVisible(false);
                        frame.setVisible(true);
                        String nomeGiudice = GiudiceGUI.this.nomeGiudiceTextField.getText();
                        String passwordGiudice = passwordGiudicePasswordField.getText();
                        controller.setGiudice(passwordGiudice, nomeGiudice);
                    } else {
                        JOptionPane.showMessageDialog(frameGiudice, "Inserire tutti i campi!");
                    }
                }
            }
        });
    }
}
