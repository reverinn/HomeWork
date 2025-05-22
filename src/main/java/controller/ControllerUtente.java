package controller;

import gui.UtenteGUI;
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



}
