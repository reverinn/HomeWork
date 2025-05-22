package gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import controller.ControllerOrganizzatore;

public class OrganizzatoreGUI {
    private JPanel panelOrganizzatore;
    private JButton closeButton;
    private JTextField nomeOrganizzatoreTextField;
    private JPasswordField passwordOrganizzatoreField;
    private JLabel etNomeOrganizzatore;
    private JButton confermaButton;
    private JButton apriButton;
    public JFrame frameOrganizzatore;
    private boolean apertura = false;
    private boolean premuto = false;

    public OrganizzatoreGUI(JFrame frame, ControllerOrganizzatore controller) {
        frameOrganizzatore = new JFrame("Organizzatore");
        frameOrganizzatore.setContentPane(this.panelOrganizzatore);
        frameOrganizzatore.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameOrganizzatore.setSize(800,800);
        frameOrganizzatore.setVisible(true);
        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frameOrganizzatore.setVisible(false);
                frame.setVisible(true);
            }
        });
        confermaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                premuto = true;
                JOptionPane.showMessageDialog(frameOrganizzatore,"Registrazione avvenuta con successo!");
                String nomeOrganizzatore = nomeOrganizzatoreTextField.getText();
                String passwordOrganizzatore = passwordOrganizzatoreField.getText();
                controller.setOrganizzatore(passwordOrganizzatore, nomeOrganizzatore);
            }
        });
        apriButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (nomeOrganizzatoreTextField.getText().isEmpty() && passwordOrganizzatoreField.getText().isEmpty()){
                    JOptionPane.showMessageDialog(frameOrganizzatore,"Inserire tutti i campi!");
                }
                else if (premuto){
                    apertura = true;
                    controller.setApertura(apertura);
                    controller.Avvio(frame, apertura);
                    frameOrganizzatore.setVisible(false);
                    frame.setVisible(true);
                }
                else{
                    JOptionPane.showMessageDialog(frameOrganizzatore,"Premere conferma prima di poter aprire le iscrizioni!");
                }
            }
        });
    }
}
