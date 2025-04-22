package model;

import model.*;
import java.util.ArrayList;

public class Team {
    //Attributi Classe
    public int dimensioneMaxTeam;
    public String nomeSquadra;

    //Aggregato di classe Utente
    ArrayList <Utente> utentiComponenti = new ArrayList<>();
    public Team(Utente utente, int dimensioneMaxTeam, String nomeSquadra) {
        this.nomeSquadra = nomeSquadra;
        this.dimensioneMaxTeam = dimensioneMaxTeam;
        utentiComponenti.add(utente);
    }

    //Classe Associativa Documento e Piattaforma
    public ArrayList <Documento> documentoCaricato = new ArrayList<>(); //piu versioni di un documento caricabili
    Piattaforma piattaforma;
    public Team(Documento d, Piattaforma piattaforma) {
        this.piattaforma = piattaforma;
        documentoCaricato.add(d);
    }
}
