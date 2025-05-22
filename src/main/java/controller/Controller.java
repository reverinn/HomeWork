package controller;

import model.*;
import gui.*;
import model.Utente;

public class Controller {
    private Utente utente;

    public Controller() {}

    public Controller(Utente utente){
        this.utente = utente;
    }

    public void SetPasswordUtente(String passwordUtente) {
        utente.setPasswordUtente(passwordUtente);
    }

}
