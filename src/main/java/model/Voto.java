package model;

import java.util.ArrayList;
import model.*;

public class Voto {
    public String valoreVoto;
    private int idGiudice; //riconoscitivo del singolo giudice che da il voto
    public String nomeSquadra;

    //Classe Associativa Giudice e Piattaforma
    Giudice giudice;
    Piattaforma piattaforma;
    public Voto(String nomeSquadra, Piattaforma piattaforma, Giudice giudice) {
        this.nomeSquadra = nomeSquadra;
        this.piattaforma = piattaforma;
        this.giudice = giudice;
    }

    public Voto(String squadra, String ValoreVoto){
        this.nomeSquadra = squadra;
        this.valoreVoto = ValoreVoto;
    }

    public String getValoreVoto() {
        return valoreVoto;
    }

    public String getNomeSquadra() {
        return nomeSquadra;
    }

    public int votoAsInt(){
        return Integer.parseInt(valoreVoto);
    }

    public String toString(){
        return "nome: " + nomeSquadra + " voto: " + valoreVoto;
    }
}
