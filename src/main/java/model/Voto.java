package model;

import java.util.ArrayList;
import model.*;

public class Voto {
    public String valoreVoto;
    private int idGiudice; //riconoscitivo del singolo giudice che da il voto
    public String nomeSquadra;



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
