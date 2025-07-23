package model;

import java.util.ArrayList;

/**
 * The type Piattaforma.
 */
public class Piattaforma {
    private int numeroMaxIscritti;

    /**
     * Instantiates a new Piattaforma.
     *
     * @param numeroMaxIscritti the numero max iscritti
     */
//costruttore base
    public Piattaforma(int numeroMaxIscritti) {
        this.numeroMaxIscritti = numeroMaxIscritti;
    }

    /**
     * The Utenti registrati.
     */
//Associazione con Utente
    public ArrayList <Utente> utentiRegistrati = new ArrayList<>();

    /**
     * Instantiates a new Piattaforma.
     *
     * @param u the u
     */
    public Piattaforma(Utente u){
        utentiRegistrati.add(u); //aggiungo l'utente "u" alla lista di utenti registrati sulla Piattaforma
    }

    /**
     * The Documento acquisito.
     */
//Associazione con Documento e Team
    public ArrayList <Documento> documentoAcquisito = new ArrayList<>();
    /**
     * The Team caricatori.
     */
    public ArrayList <Team> teamCaricatori = new ArrayList<>();

    /**
     * Instantiates a new Piattaforma.
     *
     * @param d    the d
     * @param team the team
     */
    public Piattaforma(Documento d, Team team){
        documentoAcquisito.add(d); //aggiungo il documento alla lista di documenti uploadati
        teamCaricatori.add(team); //aggiungo il team che ha caricato alla lista di team che hanno caricato il documento
    }

    /**
     * The Voti acquisiti.
     */
//Associazione con Voto e Giudice
    ArrayList <Voto> votiAcquisiti = new ArrayList<>();
    /**
     * The Giudice votante.
     */
    Giudice giudiceVotante;

    /**
     * Instantiates a new Piattaforma.
     *
     * @param voto the voto
     * @param g    the g
     */
    public Piattaforma(Voto voto, Giudice g){
        votiAcquisiti.add(voto); //aggiungo il voto dato tra la lista dei voti acquisiti dalla piattaforma
        giudiceVotante = g;
    }
}