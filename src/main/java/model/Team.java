package model;

import java.util.ArrayList;

public class Team {
    //Attributi Classe
    public static final int DIMENSIONE_MAX_TEAM = 4;
    public String nomeSquadra;

    public Team () {}

    //Aggregato di classe Utente
    ArrayList <Utente> utentiComponenti = new ArrayList<>();
    public void setTeam(Utente utente, String nomeSquadra) {
        this.nomeSquadra = nomeSquadra;
        utentiComponenti.add(utente);
    }

    //costruttore momentaneo
    public void setTeam(String nomeSquadra){
        this.nomeSquadra = nomeSquadra;
    }

    //Classe Associativa Documento e Piattaforma
    public ArrayList <Documento> documentoCaricato = new ArrayList<>(); //piu versioni di un documento caricabili
    Piattaforma piattaforma;
    public Team(Documento d, Piattaforma piattaforma) {
        this.piattaforma = piattaforma;
        documentoCaricato.add(d);
    }

}
