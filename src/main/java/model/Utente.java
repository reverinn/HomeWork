package model;

import model.Piattaforma;

public class Utente {
    protected int idUtente;
    private String passwordUtente;
    private String nomeUtente;

    //costruttore per classi figlie
    public Utente() {}

    //Associazione con Piattaforma
    Piattaforma piattaforma;
    public Utente(int idUtente, Piattaforma piattaforma) {
        this.idUtente = idUtente;
        this.piattaforma = piattaforma;
    }

    public void setUtente(String passwordUtente, String nomeUtente ) {
        this.passwordUtente = passwordUtente;
        this.nomeUtente = nomeUtente;
    }

}
