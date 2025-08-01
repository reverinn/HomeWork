package gui;

import controller.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 * The type Utente gui.
 */
public class UtenteGUI {

    private JPanel panelUtente;
    private JButton closeButton;
    private JLabel regutente;
    private JTextField nomeUtenteTextField;
    private JPasswordField passwordPasswordField;
    private JLabel etNomeUtente;
    private JLabel etPassword;
    private JButton confermaButton;
    private JComboBox scegliTeamBox;
    /**
     * The Frame utente.
     */
    public JFrame frameUtente;

    /**
     * Instantiates a new Utente gui.
     *
     * @param controllerUtente        the controller utente
     * @param frameHome               the frame home
     * @param controllerOrganizzatore the controller organizzatore
     */
    public UtenteGUI(ControllerUtente controllerUtente, JFrame frameHome, ControllerOrganizzatore controllerOrganizzatore) {
        frameUtente = new JFrame("Utente");
        frameUtente.setContentPane(this.panelUtente);
        frameUtente.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameUtente.setSize(800, 800);
        frameUtente.setVisible(true);
        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frameUtente.dispose();
                frameHome.setVisible(true);
            }
        });
        confermaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               controllerUtente.controllaConferma(frameUtente, nomeUtenteTextField.getText(), passwordPasswordField.getText(), controllerOrganizzatore, scegliTeamBox.getSelectedItem().toString());
            }
        });
    }

}






