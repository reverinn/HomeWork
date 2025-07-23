package model;

import java.util.ArrayList;

/**
 * The type Team.
 */
public class Team {
    /**
     * The constant DIMENSIONE_MAX_TEAM.
     */
//Attributi Classe
    public static final int DIMENSIONE_MAX_TEAM = 4;
    /**
     * The Nome squadra.
     */
    public String nomeSquadra;
    private int voto;
    private ArrayList<Utente> utenteTeam;

    /**
     * Instantiates a new Team.
     *
     * @param nomeSquadra the nome squadra
     * @param voto        the voto
     * @param utente      the utente
     */
    public Team (String nomeSquadra, int voto, ArrayList<Utente> utente) {
        this.nomeSquadra = nomeSquadra;
        this.voto = voto;
        this.utenteTeam = utente;
    }

    /**
     * Sets voto.
     *
     * @param voto the voto
     */
    public void setVoto(int voto) { this.voto = voto; }

    /**
     * Gets nome squadra.
     *
     * @return the nome squadra
     */
    public String getNomeSquadra() { return nomeSquadra; }

    /**
     * Gets voto.
     *
     * @return the voto
     */
    public int getVoto() { return voto; }

    /**
     * The Utenti componenti.
     */
//Aggregato di classe Utente
    ArrayList <Utente> utentiComponenti = new ArrayList<>();

    /**
     * Sets team.
     *
     * @param utente      the utente
     * @param nomeSquadra the nome squadra
     */
    public void setTeam(Utente utente, String nomeSquadra) {
        this.nomeSquadra = nomeSquadra;
        utentiComponenti.add(utente);
    }

    public String toString(){
        return "nome: " + nomeSquadra + " voto: " + voto;
    }
}
