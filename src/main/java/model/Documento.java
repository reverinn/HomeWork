package model;

import java.util.ArrayList;

public class Documento {
    //Attributi Classe Associativa
    public String nomeDocumento;
    public double versioneRilascio;
    public String orarioAggiornamento;

    //Associazione Classe Giudice
    public ArrayList <Giudice> giudiceCommentatore = new ArrayList<>();

    //Classe Associativa Team e Piattaforma
    public ArrayList <Team> teamCaricatori = new ArrayList<>();
    public Piattaforma piattaforma;

    public Documento(String nomeDocumento, double versioneRilascio, String orarioAggiornamento, Team team, Piattaforma piattaforma) {
        this.nomeDocumento = nomeDocumento;
        this.versioneRilascio = versioneRilascio;
        this.orarioAggiornamento = orarioAggiornamento;
        this.piattaforma = piattaforma;
        teamCaricatori.add(team); //aggiungo i team alla lista dei team che hanno caricato un documento
    }

}