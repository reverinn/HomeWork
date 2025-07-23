package model;

import java.util.ArrayList;

public class Piattaforma {
    private int numeroMaxIscritti;

    //costruttore base
    public Piattaforma(int numeroMaxIscritti) {
        this.numeroMaxIscritti = numeroMaxIscritti;
    }

    //Associazione con Utente
    public ArrayList <Utente> utentiRegistrati = new ArrayList<>();
    public Piattaforma(Utente u){
        utentiRegistrati.add(u); //aggiungo l'utente "u" alla lista di utenti registrati sulla Piattaforma
    }

    //Associazione con Documento e Team
    public ArrayList <Documento> documentoAcquisito = new ArrayList<>();
    public ArrayList <Team> teamCaricatori = new ArrayList<>();
    public Piattaforma(Documento d, Team team){
        documentoAcquisito.add(d); //aggiungo il documento alla lista di documenti uploadati
        teamCaricatori.add(team); //aggiungo il team che ha caricato alla lista di team che hanno caricato il documento
    }

    //Associazione con Voto e Giudice
    ArrayList <Voto> votiAcquisiti = new ArrayList<>();
    Giudice giudiceVotante;
    public Piattaforma(Voto voto, Giudice g){
        votiAcquisiti.add(voto); //aggiungo il voto dato tra la lista dei voti acquisiti dalla piattaforma
        giudiceVotante = g;
    }
}