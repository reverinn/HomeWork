package model;

import java.util.ArrayList;

public class Team {
    //Attributi Classe
    public static final int DIMENSIONE_MAX_TEAM = 4;
    public String nomeSquadra;
    private int voto;

    public Team (String nomeSquadra, int voto) {
        this.nomeSquadra = nomeSquadra;
        this.voto = voto;
    }

    public String getNomeSquadra() { return nomeSquadra; }
    public int getVoto() { return voto; }

    //Aggregato di classe Utente
    ArrayList <Utente> utentiComponenti = new ArrayList<>();
    public void setTeam(Utente utente, String nomeSquadra) {
        this.nomeSquadra = nomeSquadra;
        utentiComponenti.add(utente);
    }


}
