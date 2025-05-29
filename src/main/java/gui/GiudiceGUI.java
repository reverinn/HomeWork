package gui;

import controller.ControllerGiudice;
import controller.ControllerLoginGiudice;
import controller.ControllerOrganizzatore;
import model.Giudice;

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
    private LoginGiudiceGUI loginGiudice;
    private ControllerLoginGiudice controllerLoginGiudice;
    private Giudice giudice;
    private String nomeGiudice;
    private String passwordGiudice;

    public GiudiceGUI(JFrame frame, ControllerGiudice controllerGiudice, ControllerOrganizzatore controllerOrganizzatore) {
        frameGiudice = new JFrame("Giudici");
        frameGiudice.setContentPane(this.panelGiudice);
        frameGiudice.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameGiudice.setSize(800,800);
        frameGiudice.setVisible(true);
        giudice = new Giudice();
        controllerLoginGiudice = new ControllerLoginGiudice(giudice);
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
                nomeGiudice = nomeGiudiceTextField.getText();
                passwordGiudice = passwordGiudicePasswordField.getText();
                controllerGiudice.controllaConferma(giudice, frame, frameGiudice, nomeGiudiceTextField.getText(), passwordGiudicePasswordField.getText(), controllerOrganizzatore);
            }
        });
        seiGiaIscrittoFaiButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                loginGiudice=new LoginGiudiceGUI(frameGiudice, controllerGiudice, controllerLoginGiudice, controllerOrganizzatore);
            }
        });
    }
}
