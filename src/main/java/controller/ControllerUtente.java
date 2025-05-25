package controller;

import model.Utente;

import javax.swing.*;

public class ControllerUtente {
    private Utente utente;

    public ControllerUtente(Utente utente){
        this.utente = utente;
    }

    public void setUtente(String passwordUtente, String nomeUtente) {
        utente.setUtente(passwordUtente, nomeUtente);
    }


    //metodo che controlla i vari casi del pulsante conferma
    public void controllaConferma(JFrame frameHome, JFrame frameUtente, String nomeUtente, String passwordUtente, ControllerOrganizzatore controllerOrganizzatore) {
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
