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
    private JButton seiGiaIscrittoFaiButton;
    public JFrame frameGiudice;
    private LoginGiudice loginGiudice;
    public GiudiceGUI(JFrame frame, ControllerGiudice controller, ControllerOrganizzatore controllerOrganizzatore) {
        frameGiudice = new JFrame("Giudici");
        frameGiudice.setContentPane(this.panelGiudice);
        frameGiudice.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameGiudice.setSize(800,800);
        frameGiudice.setVisible(true);
        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frameGiudice.dispose();
                frame.setVisible(true);
            }
        });
        confermaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.controllaConferma(frame, frameGiudice, nomeGiudiceTextField.getText(), passwordGiudicePasswordField.getText(), controllerOrganizzatore);
            }
        });
        seiGiaIscrittoFaiButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                loginGiudice=new LoginGiudice(frameGiudice,controller);
            }
        });
    }
}
