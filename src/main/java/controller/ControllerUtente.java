package controller;

import gui.UtenteGUI;
import model.Utente;
import controller.ControllerOrganizzatore;

import javax.swing.*;

public class ControllerUtente {
    private Utente utente;

    public ControllerUtente(Utente utente){
        this.utente = utente;
    }

    public void setUtente(String passwordUtente, String nomeUtente) {
        utente.setUtente(passwordUtente, nomeUtente);
    }

    public void controllaConferma(JFrame frameHome, JFrame frameUtente, String nomeUtente, String passwordUtente, boolean premuto, ControllerOrganizzatore controllerOrganizzatore) {
        if (!controllerOrganizzatore.getApertura()){
            JOptionPane.showMessageDialog(frameUtente,"Le iscrizioni sono chiuse!");
        }
        else if (nomeUtente.toLowerCase().contains(" ") || passwordUtente.toLowerCase().contains(" ")){
            JOptionPane.showMessageDialog(frameUtente, "La password non può contenere spazi iniziali o finali!");
        }
        else {
            if (!nomeUtente.isEmpty() || !passwordUtente.isEmpty()) {
                JOptionPane.showMessageDialog(frameUtente, "Registrazione avvenuta con successo!");
                frameUtente.setVisible(false);
                frameHome.setVisible(true);
                setUtente(passwordUtente, nomeUtente);
            } else {
                JOptionPane.showMessageDialog(frameUtente, "Inserire tutti i campi!");
            }
        }
    }


}
