package model;

import model.Piattaforma;

public class Utente {
    protected int idUtente;
    private String passwordUtente;

    //costruttore per classi figlie
    public Utente() {}

    //Associazione con Piattaforma
    Piattaforma piattaforma;
    public Utente(int idUtente, Piattaforma piattaforma) {
        this.idUtente = idUtente;
        this.piattaforma = piattaforma;
    }

    public void setPasswordUtente(String passwordUtente) {
        this.passwordUtente = passwordUtente;
    }

}
