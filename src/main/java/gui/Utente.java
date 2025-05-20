package gui;

import javax.swing.*;

public class Utente {

    private JPanel panelUtente;
    public JFrame frameUtente;

    public Utente(JFrame frame) {
        frameUtente = new JFrame("Utente");
        frameUtente.setContentPane(new Utente().panelUtente);
        frameUtente.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameUtente.setSize(800,800);
        frameUtente.setVisible(true);
    }
    public Utente() { }


}
